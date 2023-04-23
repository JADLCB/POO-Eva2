/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ProBook
 */
public class Circulo extends Figuras {
    private double radio;
    private double area;
    private double perimetro;
    private double diametro;

    
    
    public Circulo() {
        area=-1;
        perimetro=-1;
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
    
    @Override
    public double calcularArea(){
        area = (Math.PI * radio)*(Math.PI * radio);
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    @Override
    public double calcularPerimetro(){
       perimetro=(Math.PI)*(radio*radio);
        return perimetro;
    }
    @Override
    public String toString(){
        String cade = "datos : \n" +
                       "nombre:  " + area + "\n" + 
                       "edad:  " + perimetro;
        return cade;
    }
    
    
    
}
