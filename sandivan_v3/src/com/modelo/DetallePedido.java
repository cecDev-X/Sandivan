package com.modelo;

public class DetallePedido {
    private int idAnimal;
    private int idPedido;
    private int cantidad;

    public DetallePedido(){
        
    }
    
    public DetallePedido(int idAnimal, int idPedido, int cantidad) {
        this.idAnimal = idAnimal;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   
}
