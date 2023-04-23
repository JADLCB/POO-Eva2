/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author ProBook
 */
public class persona {
    private String id;
    private String nombre;
    private int edad;
    
    
   public persona(){
       id="*****";
       nombre="easter egg";
       edad=0;
   }
   public String getid(){
       return id;
   }
   public String setid(String valor){
       id=valor;
        return id;
   }
   public String getnombre(){
       return nombre;
      
   }
  public String setnombre(String valor){
      nombre=valor;
      return nombre;
      
  }
  public int getedad(){
      return edad;
  }
  public int setedad(int valor){
        edad=valor;
        return valor;
    }
  public void imprimidatos(){
      System.out.println("Datos");
      System.out.println("id"+id);
      System.out.println("su nombre"+nombre);
      System.out.println("edad"+edad);
  }
}
