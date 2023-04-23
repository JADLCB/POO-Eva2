/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author ProBook
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int año;
    
    public Automovil(){
        marca="";
        modelo="";
        año=0;
    }
    
    public String getmarca(){
      return marca;  
    }
    public String setmarca(String valor){
        marca=valor;
        return marca;
    }
    public String getmodelo(){
      return marca;  
    }
    public String setmodelo(String valor){
        modelo=valor;
        return modelo;
    }
    public int getaño(){
      return año;  
    }
    public int setaño(int valor){
        año=valor;
        return valor;
       
    }
    
    public void imprimirdatos(){
        System.out.println("introduce la marca"+marca);
        System.out.println("introduce el modelo"+modelo);
        System.out.println("introduce elaño"+año);
    }
}
