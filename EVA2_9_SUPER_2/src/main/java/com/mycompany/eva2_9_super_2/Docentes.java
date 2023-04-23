/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_super_2;

/**
 *
 * @author ProBook
 */
public class Docentes extends Persona{
    private String plaza;

    public Docentes() {
        super();
        this.plaza="------";
    }

    public Docentes(String plaza, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
    
 
    
    
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    public void imprimirdatos(){
        
    }
    
    
}
