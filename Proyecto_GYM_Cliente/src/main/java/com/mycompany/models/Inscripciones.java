/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author Usuario
 */
public class Inscripciones {
    
    private int ID;
    private String Dia;
    private String Horario;
    private String Area;
    private String Instructor;

    public void setID(int ID) {
        this.ID = ID;
    }
    

    public void setArea(String Area) {
        this.Area = Area;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
    
     public void setInstructor(String Instructor) {
        this.Instructor = Instructor;
    }
     
     public void setDia(String Dia) {
        this.Dia = Dia;
    } 
     
    public int getID() {
        return ID;
    }

    public String getArea() {
        return Area;
    }

    public String getDia() {
        return Dia;
    }
    
    public String getHorario() {
        return Horario;
    }
    
        public String getInstructor() {
        return Instructor;
    }
    
}
