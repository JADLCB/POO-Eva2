/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_21_polimorfismo_vehiculo;

/**
 *
 * @author ProBook
 */
public class EVA2_21_POLIMORFISMO_VEHICULO {

    public static void main(String[] args) {
    Automovil auto1=new Automovil("juan", 2121, "ford", 100);
    auto1.tablero();
    auto1.cambiarVelocidad(50);
        
    Bicicleta bici1= new Bicicleta("montaña");
    bici1.tablero();
    bici1.cambiarVelocidad(10);
    }
    public static void modificarVel(ControlarDatos datos,int vel){
        datos.cambiarVelocidad(vel);
        datos.tablero();
    }
}
