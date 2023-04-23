/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_9_super_2;

/**
 *
 * @author ProBook
 */
public class EVA2_9_SUPER_2 {

    public static void main(String[] args) {
        Estudiante estudiante= new Estudiante("22032","juan peres","de la cruz",12);
        estudiante.imprimirDatos();
        
    
    Docentes docente=new Docentes();
   docente.imprimirDatos();
 System.out.println("No deplaza:"+docente.getPlaza());
        
         
    }     
            
            
            
}
