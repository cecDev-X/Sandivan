package com.dao;

import com.conexion.Conexion;
import com.modelo.Habitat;
import java.sql.*;
import java.util.*;

class HabitatDAO {

    public static boolean insertar(Habitat h) {
        String sql = "INSERT INTO sandivan.habitat (codigo_habitat, descripcion) VALUES (?, ?)";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, h.getCodigoHabitat());
            ps.setString(2, h.getDescripcion());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
