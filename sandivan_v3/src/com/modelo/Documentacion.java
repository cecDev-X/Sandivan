package com.modelo;

public class Documentacion {
    private int idDocumento;
    private String tipo;
    private String archivo;
    private int idAnimal;

    public Documentacion() {
    }
    
    public Documentacion(int idDocumento, String tipo, String archivo, int idAnimal) {
        this.idDocumento = idDocumento;
        this.tipo = tipo;
        this.archivo = archivo;
        this.idAnimal = idAnimal;
    }
        
    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }
    
    
}
