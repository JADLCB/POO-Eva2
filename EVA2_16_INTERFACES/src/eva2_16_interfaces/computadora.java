/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_interfaces;

/**
 *
 * @author ProBook
 */
public class computadora extends producto implements Mostrar_datos{
    private String marca;
    private String procesador;

    public computadora() {
    }
    

    public computadora(String marca, String procesador) {
        this.marca = marca;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre"+getnombre());
        System.out.println("precio"+getPrecio);
        System.out.println("marca"+marca);
        System.out.println("peocesador"+procesador);
               
    }
    
}


