package com.dao;

import com.conexion.Conexion;
import com.modelo.Proveedor;
import java.sql.*;
import java.util.*;

class ProveedorDAO {
    public static boolean insertar(Proveedor p) {
        String sql = "INSERT INTO sandivan.proveedor ( nombre_empresa, contacto, ubicacion) VALUES (?, ?, ?)";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
          
            ps.setString(1, p.getNombreEmpresa());
            ps.setString(2, p.getContacto());
            ps.setString(3, p.getUbicacion());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}