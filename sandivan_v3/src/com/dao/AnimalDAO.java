package com.dao;

import com.conexion.Conexion;
import com.modelo.Animal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AnimalDAO {

    public static boolean insertar(Animal a) {

        String sql = "INSERT INTO sandivan.animal (nombre_comun, edad, sexo, precio, "
                + "stock_disponible, codigo_habitat, codigo_proveedor) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, a.getNombreComun());
            ps.setInt(2, a.getEdad());
            ps.setString(3, String.valueOf(a.getSexo()));
            ps.setDouble(4, a.getPrecio());

            ps.setInt(5, a.getStockDisponible());
            ps.setString(6, a.getCodigoHabitat());
            ps.setInt(7, a.getCodigoProveedor());

            int affectedRows = ps.executeUpdate();

            if (affectedRows > 0) {
                // Obtener el ID generado
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        a.setIdAnimal(rs.getInt(1)); // Asignar el ID generado
                    }
                }
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean actualizar(Animal a) {
        String sql = "UPDATE sandivan.animal SET nombre_comun=?, edad=?, sexo=?, precio=?, "
                + "stock_disponible=?, codigo_habitat=?, codigo_proveedor=? "
                + "WHERE id_animal=?";

        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, a.getNombreComun());
            ps.setInt(2, a.getEdad());
            ps.setString(3, String.valueOf(a.getSexo()));
            ps.setDouble(4, a.getPrecio());
            ps.setInt(5, a.getStockDisponible());
            ps.setString(6, a.getCodigoHabitat());
            ps.setInt(7, a.getCodigoProveedor());
            ps.setInt(8, a.getIdAnimal());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void disminuirStock(String nombreAnimal, int cantidadVendida) {
        Connection con = Conexion.getConexion();
        try {
            String sql = "UPDATE animal SET stock_disponible = stock_disponible - ? WHERE nombre_comun = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantidadVendida);
            ps.setString(2, nombreAnimal);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean eliminar(int idAnimal) {
        String sql = "DELETE FROM sandivan.animal WHERE id_animal = ?";

        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idAnimal);
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al eliminar: " + e.getMessage(),
                    "Error en base de datos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Método para obtener todos los animales
    public static List<Animal> obtenerTodosAnimales() {
        List<Animal> animales = new ArrayList<>();
        String sql = "SELECT * FROM sandivan.animal";

        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Animal animal = new Animal(
                        rs.getInt("id_animal"),
                        rs.getString("nombre_comun"),
                        rs.getInt("edad"),
                        rs.getString("sexo").charAt(0),
                        rs.getDouble("precio"),
                        rs.getInt("stock_disponible"),
                        rs.getString("codigo_habitat"),
                        rs.getInt("codigo_proveedor")
                );
                animales.add(animal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animales;
    }

    public static List<Animal> obtenerAnimalesPrecioYNombre(String busqueda) {
        List<Animal> animales = new ArrayList<>();
        String sql = "SELECT nombre_comun, precio FROM sandivan.animal WHERE LOWER(nombre_comun) LIKE ?";

        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + busqueda.toLowerCase() + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Animal animal = new Animal();
                animal.setNombreComun(rs.getString("nombre_comun"));
                animal.setPrecio(rs.getDouble("precio"));
                animales.add(animal);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animales;
    }

    // Método adicional para buscar por ID (útil para edición)
    public static Animal obtenerPorId(int id) {
        String sql = "SELECT * FROM sandivan.animal WHERE id_animal = ?";

        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Animal(
                            rs.getInt("id_animal"),
                            rs.getString("nombre_cientifico"),
                            rs.getInt("edad"),
                            rs.getString("sexo").charAt(0),
                            rs.getDouble("precio"),
                            rs.getInt("stock_disponible"),
                            rs.getString("codigo_habitat"),
                            rs.getInt("codigo_proveedor")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
