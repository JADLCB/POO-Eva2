/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author ProBook
 */
public class television {
    private int canal;
    private int volumen;
    private String power;
    
    public television(){
        canal=0;
        volumen=0;
        power="****";
    }
    public int setcanal(){
        return canal;
    }
    public int getcanal(int valor){
        canal=valor;
                return valor;
    }
    public int getvolumen(){
        return volumen;
    }
    public int setvolumen(int valor){
        volumen=valor;
        return valor;
    }
    public String getpowe(){
        return power;
    }        
    public String setpower(String valor){
        power=valor;
        return valor;
    }
    public void imprimirdatos(){
        System.out.println("canal"+canal);
        System.out.println("volumen"+volumen);
        System.out.println("power"+power);
              
    }
}
