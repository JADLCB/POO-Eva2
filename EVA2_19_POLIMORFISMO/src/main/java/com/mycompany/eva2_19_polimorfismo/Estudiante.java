/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_19_polimorfismo;

/**
 *
 * @author ProBook
 */              //clase derivada extends clase base
                 //clase hijo extends Clase base
                 //SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {
    public String nControl;
    
    public Estudiante(){//constructor default
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPER CLASE
        this.nControl="------";
    }

    public Estudiante(String nControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.nControl = nControl;
    }
    
    

    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }
}
