package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
   private static final String URL = "jdbc:postgresql://localhost:5432/sandivan?currentSchema=sandivan";

;
    private static final String USER = "postgres";
    private static final String PASSWORD = "Saladito68";

    public static Connection getConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

