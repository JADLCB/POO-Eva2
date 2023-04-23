/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_figuras;

/**
 *
 * @author Probook
 */
public class Triangulo extends Figuras {
    private double altura;
    private double base;
   private double lado;
    private double area;
    private double perimetro;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Triangulo() {
        area=-1;
        perimetro=-1;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

  @Override
   public double calcularArea() {
       area=(base*altura)/2;
    return area;
   }
@Override
   public double calcularPerimetro(){
       double hip=Math.sqrt(base*base)+(altura*altura);
       return base+altura+hip;
   }
   @Override
    public String toString(){
        String cade = "datos : \n" +
                       "nombre:  " + area + "\n" + 
                       "edad:  " + perimetro;
        return cade;
        
        
    }
}
