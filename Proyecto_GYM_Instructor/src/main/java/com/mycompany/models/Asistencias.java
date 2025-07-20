/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author Usuario
 */
public class Asistencias {
    
    private int ID;
    private String Nombre;
    private String Apellido;
    private String Area;
    private String Fecha;
    private String Horario;

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
    
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
    
    public int getID() {
        return ID;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }


    public String getArea() {
        return Area;
    }


    public String getHorario() {
        return Horario;
    }
    

    public String getFecha() {
        return Fecha;
    }
    
}
