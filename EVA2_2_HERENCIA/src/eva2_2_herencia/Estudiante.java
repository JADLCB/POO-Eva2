/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_herencia;

/**
 *
 * @author ProBook
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
  private String Ncontrol;
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, String Ncontrol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Ncontrol = Ncontrol;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNcontrol() {
        return Ncontrol;
    }

    public void setNcontrol(String Ncontrol) {
        this.Ncontrol = Ncontrol;
    }
  
    
    
}
