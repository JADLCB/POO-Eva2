/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author ProBook
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante Es=new Estudiante();
        Es.setNombre("juan");
        Es.setApellido("perez");
        Es.setEdad(50);
        Es.setnControl("22550303");
        System.out.println("Datos Del Estudiante");
        System.out.println(Es.getNombre());
        System.out.println(Es.getApellido());
        System.out.println(Es.getEdad());
        System.out.println(Es.getnControl());
        
        
        Docentes Do=new Docentes();
        Do.setNombre("juan");
        Do.setApellido("carrazco");
        Do.setEdad(12);
        Do.setPlaza("DSHJD");
        
        
    }
    
}
