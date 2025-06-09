package com.modelo;

public class Habitat {
    private String codigoHabitat;
    private String descripcion;

    public Habitat() {
    }
    
    public Habitat(String codigoHabitat, String descripcion) {
        this.codigoHabitat = codigoHabitat;
        this.descripcion = descripcion;
    }

    public String getCodigoHabitat() {
        return codigoHabitat;
    }

    public void setCodigoHabitat(String codigoHabitat) {
        this.codigoHabitat = codigoHabitat;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}

