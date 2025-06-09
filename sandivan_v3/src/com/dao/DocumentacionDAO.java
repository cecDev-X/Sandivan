package com.dao;

import com.conexion.Conexion;
import com.modelo.Documentacion;
import java.sql.*;
import java.util.*;

class DocumentacionDAO {
    public static boolean insertar(Documentacion d) {
        String sql = "INSERT INTO sandivan.documentacion (tipo, archivo, id_animal) VALUES (?, ?, ?)";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, d.getTipo());
            ps.setString(2, d.getArchivo());
            ps.setInt(3, d.getIdAnimal());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}