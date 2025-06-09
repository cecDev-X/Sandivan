package com.modelo;

public class Proveedor {
    private int id_proveedor;
    private String nombreEmpresa;
    private String contacto;
    private String ubicacion;

    public Proveedor(){  
    }
    
    public Proveedor( String nombreEmpresa, String contacto, String ubicacion) { //ASIGNA NUEVOS
       
        this.nombreEmpresa = nombreEmpresa;
        this.contacto = contacto;
        this.ubicacion = ubicacion;
    }
    
    public Proveedor(int id_proveedor, String nombreEmpresa, String contacto, String ubicacion) { //REGRESA DE BD A OBJETO
        this.id_proveedor = id_proveedor;
        this.nombreEmpresa = nombreEmpresa;
        this.contacto = contacto;
        this.ubicacion = ubicacion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
