package com.modelo;

import java.sql.Timestamp;

public class Pedido {

    private int idPedido;
    private String rfcCliente;
    private Timestamp fecha;
    private String status;
    private String metodoPago;

    public Pedido() {
    }

    public Pedido(int idPedido, String rfcCliente, Timestamp fecha, String status, String metodoPago) {
        this.idPedido = idPedido;
        this.rfcCliente = rfcCliente;
        this.fecha = fecha;
        this.status = status;
        this.metodoPago = metodoPago;
    }

    public Pedido(String rfcCliente, Timestamp fecha, String status, String metodoPago) {
        this.rfcCliente = rfcCliente;
        this.fecha = fecha;
        this.status = status;
        this.metodoPago = metodoPago;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getRfcCliente() {
        return rfcCliente;
    }

    public void setRfcCliente(String rfcCliente) {
        this.rfcCliente = rfcCliente;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

}
