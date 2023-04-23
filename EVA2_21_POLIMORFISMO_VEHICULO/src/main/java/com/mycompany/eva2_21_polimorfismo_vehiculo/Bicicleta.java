/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_21_polimorfismo_vehiculo;

/**
 *
 * @author ProBook
 */
public class Bicicleta extends Vehiculo implements ControlarDatos {
    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
          int vel =velocidad + cambio;
        if(vel>=0)
            velocidad=vel;
    }

    @Override
    public void tablero() {
        System.out.println("bicicleta");
        System.out.println("Velocidad"+velocidad);
    }
    
}
