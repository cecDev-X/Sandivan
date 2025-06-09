package com.modelo;

import java.sql.Date;

public class Envio {
    private int idEnvio;
    private int idPedido;
    private String numSeguimiento;
    private String paqueteria;
    private Date fechaEntrega;
    private String direccionEntrega;

    public Envio() {
    }
    
    public Envio(int idEnvio, int idPedido, String numSeguimiento, String paqueteria, Date fechaEntrega, String direccionEntrega) {
        this.idEnvio = idEnvio;
        this.idPedido = idPedido;
        this.numSeguimiento = numSeguimiento;
        this.paqueteria = paqueteria;
        this.fechaEntrega = fechaEntrega;
        this.direccionEntrega = direccionEntrega;
    }
    
    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNumSeguimiento() {
        return numSeguimiento;
    }

    public void setNumSeguimiento(String numSeguimiento) {
        this.numSeguimiento = numSeguimiento;
    }

    public String getPaqueteria() {
        return paqueteria;
    }

    public void setPaqueteria(String paqueteria) {
        this.paqueteria = paqueteria;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEnvio) {
        this.direccionEntrega = direccionEnvio;
    }
    
    
}
