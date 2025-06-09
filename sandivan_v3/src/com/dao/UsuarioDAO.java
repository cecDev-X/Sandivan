package com.dao;

import com.conexion.Conexion;
import com.modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public static boolean crearUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (rfc, nombres, apellidos, telefono, direccion, correo, clavesita, id_rol) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexion = Conexion.getConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setString(1, usuario.getRfc());
            stmt.setString(2, usuario.getNombres());
            stmt.setString(3, usuario.getApellidos());
            stmt.setString(4, usuario.getTelefono());
            stmt.setString(5, usuario.getDireccion());
            stmt.setString(6, usuario.getCorreo());
            stmt.setString(7, usuario.getClavesita());
            stmt.setInt(8, usuario.getIdRol());

            return stmt.executeUpdate() > 0;
        }
    }

    public static Usuario obtenerPorRfc(String rfc) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE rfc = ?";

        try (Connection conexion = Conexion.getConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setString(1, rfc);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapearUsuario(rs);
                }
            }
        }
        return null;
    }

    public static boolean actualizarUsuario(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuario SET nombres = ?, apellidos = ?, telefono = ?, "
                + "direccion = ?, correo = ?, clavesita = ?, id_rol = ? WHERE rfc = ?";

        try (Connection conexion = Conexion.getConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setString(1, usuario.getNombres());
            stmt.setString(2, usuario.getApellidos());
            stmt.setString(3, usuario.getTelefono());
            stmt.setString(4, usuario.getDireccion());
            stmt.setString(5, usuario.getCorreo());
            stmt.setString(6, usuario.getClavesita());
            stmt.setInt(7, usuario.getIdRol());
            stmt.setString(8, usuario.getRfc());

            return stmt.executeUpdate() > 0;
        }
    }

    public static boolean eliminarUsuario(String rfc) throws SQLException {
        String sql = "DELETE FROM usuario WHERE rfc = ?";

        try (Connection conexion = Conexion.getConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setString(1, rfc);
            return stmt.executeUpdate() > 0;
        }
    }

    public static List<Usuario> listarTodos() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";

        try (Connection conexion = Conexion.getConexion();
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                usuarios.add(mapearUsuario(rs));
            }
        }
        return usuarios;
    }

    public static List<Usuario> buscarPorRol(int idRol) throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario WHERE id_rol = ?";

        try (Connection conexion = Conexion.getConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setInt(1, idRol);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    usuarios.add(mapearUsuario(rs));
                }
            }
        }
        return usuarios;
    }

    public static Usuario autenticar(String correo, String clave) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE correo = ? AND clavesita = ?";

        try (Connection conexion = Conexion.getConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setString(1, correo);
            stmt.setString(2, clave);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapearUsuario(rs);
                }
            }
        }
        return null;
    }

    public static String rolUsuario(Usuario user) throws SQLException {
        String sql = "SELECT descrip FROM rol WHERE id_rol = ?";

        try (Connection conexion = Conexion.getConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setInt(1, user.getIdRol());

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("descrip");
                }
            }
        }
        return null;
    }

    public static boolean existeRfc(String rfc) throws SQLException {
        String sql = "SELECT 1 FROM usuario WHERE rfc = ?";

        try (Connection conexion = Conexion.getConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setString(1, rfc);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    public static Usuario usuarioEncontrado(String correo) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE correo = ?";

        try (Connection conexion = Conexion.getConexion();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setString(1, correo);
        
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapearUsuario(rs);
                }
            }
        }
        return null;
    }
     public static boolean correoUnico(String correo)
             throws SQLException {
    String sql = "SELECT 1 FROM usuario WHERE correo = ? LIMIT 1";

    try (Connection conexion = Conexion.getConexion();
         PreparedStatement stmt = conexion.prepareStatement(sql)) {
        
        stmt.setString(1, correo);
        
        try (ResultSet rs = stmt.executeQuery()) {
            return !rs.next();
        }
    }
}


    public static Usuario obtenerCorreo(String correo_cajero) {
        String sql = "SELECT * FROM sandivan.usuario WHERE correo = ?";

        try (Connection con = Conexion.getConexion(); 
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, correo_cajero);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                            rs.getString("rfc"),
                            rs.getString("nombres"),
                            rs.getString("apellidos"),
                            rs.getString("telefono"),
                            rs.getString("direccion"),
                            rs.getString("correo"),
                            rs.getString("clavesita"),
                            rs.getInt("id_rol")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar cajero por usuario: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
      public  static Usuario buscarcorreo(String usuario) {
        return obtenerCorreo(usuario);
    }

    private static Usuario mapearUsuario(ResultSet rs) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setRfc(rs.getString("rfc"));
        usuario.setNombres(rs.getString("nombres"));
        usuario.setApellidos(rs.getString("apellidos"));
        usuario.setTelefono(rs.getString("telefono"));
        usuario.setDireccion(rs.getString("direccion"));
        usuario.setCorreo(rs.getString("correo"));
        usuario.setClavesita(rs.getString("clavesita"));
        usuario.setIdRol(rs.getInt("id_rol"));
        return usuario;
    }
}