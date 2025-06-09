package com.modelo;

public class Usuario {

    private String rfc;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String correo;
    private String clavesita;
    private int idRol;
    
    public Usuario(){   
    }

    public Usuario(String rfc, String nombres, String apellidos, String telefono, String direccion, String correo, String clavesita, int idRol) {
        this.rfc = rfc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.clavesita = clavesita;
        this.idRol = idRol;
    }
    

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClavesita() {
        return clavesita;
    }

    public void setClavesita(String clavesita) {
        this.clavesita = clavesita;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    
}
