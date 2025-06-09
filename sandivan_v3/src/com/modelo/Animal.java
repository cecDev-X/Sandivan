package com.modelo;

public class Animal {

    private int idAnimal;
    private String nombre_comun;
    private int edad;
    private char sexo;
    private double precio;
    private int stockDisponible;
    private String codigoHabitat;
    private int codigoProveedor;

    public Animal() {
    }

    //CONSTRUCTOR QUE ASIGNA UNO NUEVO
    public Animal(String nombre_comun, int edad, char sexo, double precio, int stockDisponible, String codigoHabitat, int codigoProveedor) {
        this.nombre_comun = nombre_comun;
        this.edad = edad;
        this.sexo = sexo;
        this.precio = precio;
        this.stockDisponible = stockDisponible;
        this.codigoHabitat = codigoHabitat;
        this.codigoProveedor = codigoProveedor;
    }

    //REGRESA DE BD A OBJETO
    public Animal(int idAnimal, String nombre_comun, int edad, char sexo, double precio, int stockDisponible, String codigoHabitat, int codigoProveedor) {
        this.idAnimal = idAnimal;
        this.nombre_comun = nombre_comun;
        this.edad = edad;
        this.sexo = sexo;
        this.precio = precio;
        this.stockDisponible = stockDisponible;
        this.codigoHabitat = codigoHabitat;
        this.codigoProveedor = codigoProveedor;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public String getNombreComun() {
        return nombre_comun;
    }

    public void setNombreComun(String nombre) {
        this.nombre_comun = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public String getCodigoHabitat() {
        return codigoHabitat;
    }

    public void setCodigoHabitat(String codigoHabitat) {
        this.codigoHabitat = codigoHabitat;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

}
