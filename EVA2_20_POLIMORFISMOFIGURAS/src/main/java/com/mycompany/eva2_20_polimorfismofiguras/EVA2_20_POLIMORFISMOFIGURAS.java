/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_20_polimorfismofiguras;

import java.util.Scanner;

/**
 *
 * @author ProBook
 */
public class EVA2_20_POLIMORFISMOFIGURAS {

    public static void main(String[] args) {
     Circulo circu=new Circulo();
     circu.imprimirDatos();
     //FIGURA ES PADRE DE CIRCULO
     //PODEMOS ASIGNAR UN OBJETO A CIRCULO A UNA VARIABLE FIGURA
   /*  Figuras figu =circu;
     
        System.out.println("USANDO FIGURAS:");
        System.out.println("Area"+figu.calcularArea());
        System.out.println("Perimetro"+figu.calcularPeri());
     
    */
   //int[]arreglo=new int [10];
   //donde inicia y termina un arreglo
   //primer posicion:0
   //ultima posicion:N-1.N es cantidad de elementos delarreglo
   //arreglo[0]=100;
        //System.out.println(arreglo[0]);
        //System.out.println("cuantas figuras necesitas?");
       Scanner input= new Scanner(System.in);
       int cant=input.nextInt();
       Figuras[] figuras= new Figuras[cant];
       Circulo[] circulos=new Circulo[cant];
       circulos[0]=new Circulo();
       circulos[0].imprimirDatos();
        for (int i = 0; i < figuras.length; i++) {
            circulos[i]=new Circulo();
            System.out.println("que tipo de figura necesitas");
            int tipo=input.nextInt();
            if(tipo==1){//circulo
               
                System.out.println("introduce el radio");
                circu.setRadio(input.nextDouble());
                figuras[i]=circu;
            }else{//triangulo
                triangulo trian=new triangulo();
                System.out.println("introduce la base");
                trian.setBase(input.nextDouble());
                System.out.println("introduce laaltura");
                trian.setAltura(input.nextDouble());
                figuras[i]=trian;
            }
        }
        //imprimir los resultados
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Circulo)
            System.out.println("Circulo"+i);
            Circulo circulo= (Circulo)figuras[i];
        
            else{
                System.out.println("triangulo"+i);
                //casting: -- Conversión
                //EJEMPLO 
              //int val= (int) (Math.random()*100);
              triangulo triangulo=(triangulo)figuras[i];
                    }
            System.out.println("Area"+ figuras[i].calcularArea());
            System.out.println("perimetro"+ figuras[i].calcularPeri());
        }
        
}
}