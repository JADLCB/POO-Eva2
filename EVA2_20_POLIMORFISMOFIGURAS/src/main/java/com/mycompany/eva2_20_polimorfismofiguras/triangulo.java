/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_20_polimorfismofiguras;

/**
 *
 * @author ProBook
 */
public class triangulo implements Figuras,MostrarDatos {
    private double base;
    private double altura;

    public triangulo() {
    }

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPeri() {
        
        double hip=Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        return base+altura+(hip);
    }

    @Override
    public void imprimirDatos() {
       
        System.out.println("base"+base);
        System.out.println("altura"+altura);
        System.out.println("area"+calcularArea());    
        System.out.println("perimetro"+calcularPeri());    
}
}
