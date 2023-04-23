/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author ProBook
 */
public  class Circulo implements Figuras,MostrarDatos{
    private double radio;

    public Circulo() {
    }
    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
//LA INTERFAZ ES COMO UN CONTRATO,TE OBLIGA A SEGUIR CIERTOS  COMPORTAMIENTOS
    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPeri() {
        return Math.PI*(radio*2);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("radio"+radio);
        System.out.println("area"+calcularArea());
        System.out.println("perimetro"+calcularPeri());
               
    }
    
}
