package com.mycompany.models;


public class Equipos {
    
    private int ID;
    private String Nombre;
    private int Cantidad;

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public int getID() {
        return ID;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }
    
    
    
    
}
