package com.modelo;

public class Rol {
    private int id_rol;
    private String descrip;

    public Rol() {

    }

    public Rol(String descrip) {
        this.descrip = descrip;
    }
    public Rol(int id_rol, String descrip){
        this.id_rol = id_rol;
        this.descrip = descrip;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

}
