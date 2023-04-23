/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_19_polimorfismo;

/**
 *
 * @author ProBook
 */
public class EVA2_19_POLIMORFISMO {

    public static void main(String[] args) {
        Persona persona=new Persona();
        
        Docentes doc= new Docentes("Tiemplo completo","juan","perez",12);
        //doc.imprimirdatos();
       Estudiante Estu=new Estudiante("22550303","jesus","alberto",23);
       //Estu.imprimirDatos();
       Persona Perso= new Persona("jesus","alberto",21);
       //Perso.imprimirDatos();
       //en resumen esto es polimorfismo:
       Persona perso=doc;
       perso.imprimirDatos();
       Persona perso1=Estu;
       perso1.imprimirDatos();
       //alreves
       //no se puede hacer una conversio de super clase a sun clase
       //EN este caso, no  existe la plaza
      // Docente doc=Persona;
       
       
    }
}
