package com.dao;

import com.conexion.Conexion;
import com.modelo.Rol;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RolDAO {
    public static List<Rol> obtenerTodosRoles() {
    List<Rol> roles = new ArrayList<>();
    String sql = "SELECT id_rol, descrip FROM roles ORDER BY descrip";
    
    // Declarar fuera del try para poder cerrarlos en el finally
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        con = Conexion.getConexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Rol rol = new Rol(
                rs.getInt("id_rol"),
                rs.getString("descrip")
            );
            roles.add(rol);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Opcional: Puedes lanzar una excepción personalizada
        throw new RuntimeException("Error al obtener roles: " + e.getMessage(), e);
    } finally {
        // Cerrar recursos en orden inverso a su apertura
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return roles;
}
    
}
