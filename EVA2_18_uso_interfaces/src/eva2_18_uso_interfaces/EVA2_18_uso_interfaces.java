/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author ProBook
 */
public class EVA2_18_uso_interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Figuras figu=new Figuras(); no sepuede
    //  MostrarDatos Mos=new MOstrar Datos(); tampoco fushi
    Circulo cir=new Circulo();
    cir.setRadio(20);
    cir.imprimirDatos();
        System.out.println("TRIANGULO");
    triangulo tri=new triangulo();
    tri.setAltura(12);
    tri.setBase(14);
    tri.imprimirDatos();
    }
    
}
