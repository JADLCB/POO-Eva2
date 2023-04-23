package eva2_16_interfaces;


import eva2_16_interfaces.Mostrar_datos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ProBook
 */
public class Persona implements Mostrar_datos{
   private String nombre;
   private int edad;

   
   
   
    public Persona() {
        this.nombre="uwu";
        this.edad=0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("nombre"+nombre);
        System.out.println("edad"+edad);
                
    }
    
}
