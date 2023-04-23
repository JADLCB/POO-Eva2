/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_figuras;

/**
 *
 * @author Probook
 */
public class EVA2_11_FIGURAS {

    public static void main(String[] args) {
        Circulo cir = new Circulo (50);
        Triangulo Tri= new Triangulo(12.00,12.00);
        System.out.println("area:  " + cir.calcularArea());
        System.out.println("perimetro:" +cir.calcularPerimetro());
        System.out.println("area"+Tri.calcularArea());
        System.out.println("perimetro"+Tri.calcularPerimetro());
        
        Figuras fig=new Figuras();
        System.out.println("area"+fig.calcularArea());
        System.out.println("perimetro"+fig.calcularPerimetro());
                
    }
  

         
        
        
        

}
