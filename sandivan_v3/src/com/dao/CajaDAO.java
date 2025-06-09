package com.dao;

import com.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class CajaDAO {
    
    public static int obtenerStockActual(int idAnimal) throws SQLException {
        int stock = 0;
        try (Connection cn = Conexion.getConexion(); 
             PreparedStatement ps = cn.prepareStatement(
                "SELECT stock_disponible FROM animal WHERE id_animal = ?")) {
            
            ps.setInt(1, idAnimal);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    stock = rs.getInt("stock_disponible");
                }
            }
        }
        return stock;
    }

    public static void actualizarStock(int idAnimal, int cantidadVendida) throws SQLException {
        try (Connection cn = Conexion.getConexion(); 
             PreparedStatement ps = cn.prepareStatement(
                "UPDATE animal SET stock_disponible = stock_disponible - ? WHERE id_animal = ?")) {
            
            ps.setInt(1, cantidadVendida);
            ps.setInt(2, idAnimal);
            ps.executeUpdate();
        }
    }

    public static int obtenerIdAnimal(String nombreAnimal) throws SQLException {
        int id = -1;
        try (Connection cn = Conexion.getConexion(); 
             PreparedStatement ps = cn.prepareStatement(
                "SELECT id_animal FROM animal WHERE nombre_comun = ?")) {
            
            ps.setString(1, nombreAnimal);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    id = rs.getInt("id_animal");
                }
            }
        }
        return id;
    }

    public static boolean procesarPago(List<Map<String, Object>> productos) throws SQLException {
        Connection cn = null;
        try {
            cn = Conexion.getConexion();
            cn.setAutoCommit(false);
            
            for (Map<String, Object> producto : productos) {
                String nombreProducto = (String) producto.get("nombre");
                int cantidadVendida = (Integer) producto.get("cantidad");
                
                if (!actualizarStockProducto(cn, nombreProducto, cantidadVendida)) {
                    cn.rollback();
                    return false;
                }
            }
            
            cn.commit();
            return true;
        } catch (SQLException e) {
            if (cn != null) cn.rollback();
            throw e;
        } finally {
            if (cn != null) {
                try {
                    cn.setAutoCommit(true);
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar conexión: " + e.getMessage());
                }
            }
        }
    }

   private static boolean actualizarStockProducto(Connection cn, String nombreProducto, int cantidadVendida) 
        throws SQLException {
    
    // 1. Normalizar el nombre del producto (eliminar espacios, uniformizar mayúsculas)
    nombreProducto = nombreProducto.trim().toLowerCase();
    
    // 2. Consulta mejorada con manejo de mayúsculas/minúsculas
    String consulta = "SELECT id_animal, stock_disponible FROM animal WHERE LOWER(TRIM(nombre_comun)) = ?";
    
    try (PreparedStatement ps = cn.prepareStatement(consulta)) {
        ps.setString(1, nombreProducto);
        
        try (ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) {
                // Producto no encontrado - mensaje detallado
                System.err.println("Producto no encontrado en BD: '" + nombreProducto + "'");
                return false;
            }
            
            int id = rs.getInt("id_animal");
            int stockActual = rs.getInt("stock_disponible");
            
            // Manejar caso cuando stock es NULL
            if (rs.wasNull()) {
                System.err.println("El producto '" + nombreProducto + "' tiene stock NULL");
                return false;
            }
            
            if (stockActual < cantidadVendida) {
                System.err.println("Stock insuficiente. Producto: '" + nombreProducto + 
                                 "'. Stock actual: " + stockActual + 
                                 ", Se requiere: " + cantidadVendida);
                return false;
            }
            
            // Actualizar stock
            try (PreparedStatement psUpdate = cn.prepareStatement(
                    "UPDATE animal SET stock_disponible = ? WHERE id_animal = ?")) {
                
                psUpdate.setInt(1, stockActual - cantidadVendida);
                psUpdate.setInt(2, id);
                
                int filasActualizadas = psUpdate.executeUpdate();
                if (filasActualizadas == 0) {
                    System.err.println("No se pudo actualizar el stock para ID: " + id);
                    return false;
                }
                return true;
            }
        }
    }
}
}