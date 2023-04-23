/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_22_has_dirrecion;

/**
 *
 * @author ProBook
 */
public class EVA2_22_HAS_DIRRECION {

    public static void main(String[] args) {
persona Persona=new persona();
Persona.setNombre("pedro");
Persona.setApellidos("pascal");
Persona.setEdad(43);
/*Direccion direccion= new Direccion();
direccion.setCalle("av. industrial");
direccion.setNumero(11101);
direccion.setColonia("complejo industrial");
direccion.setCp("31305");
direccion.setCiudad("chihuahua");
direccion.setEstado("CHihuahua");
Persona.setDireccion(direccion);*/
Persona.imprimirDatos();
    }
}
class Direccion{
 private String calle;
 private int numero;
 private String colonia;
 private String cp;
 private String ciudad;
 private String estado;

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public Direccion() {
        calle="";
        numero=0;
        colonia="";
        cp="";
        ciudad="";
        estado="";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void imprimirDatos(){
        System.out.println("Dirreccion");
        System.out.println(calle+""+numero+""+colonia+""+ciudad+""+cp+"");
    }
 
}
class persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private Direccion direccion;

    public persona(String nombre, String apellidos, int edad, Direccion direccion) {
        this.nombre = "-----";
        this.apellidos = "-------";
        this.edad = 0;
        this.direccion = null;
    }

    public persona() {
        nombre="";
        apellidos="";
        edad=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void imprimirDatos(){
        System.out.println("persona:");
        System.out.println(nombre+""+apellidos+""+edad+"años");
        if(direccion==null)
            System.out.println("sin direccion");
        else
        direccion.imprimirDatos();
    }
}
