/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_21_polimorfismo_vehiculo;

/**
 *
 * @author ProBook
 */
public class Automovil extends Vehiculo implements ControlarDatos{
    private String modelo;
    private int año;

    public Automovil(String modelo, int año,String marca,int velocidad) {
        super(marca,velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public Automovil() {
        super();
        this.año=0;
        this.modelo="____";
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
        int vel =velocidad + cambio;
        if(vel>=0)
            velocidad=vel;
    }

    @Override
    public void tablero() {
        System.out.println("automovil");
        System.out.println("Velocidad"+velocidad);
        System.out.println("Combustible(pendiente)");
        System.out.println("Revoluciones(pendiente)");
    }
    
}
