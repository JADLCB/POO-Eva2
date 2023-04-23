/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author ProBook
 */
public class EVA2_4_FORMATO_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sitio_web Sw= new Sitio_web();
        Sw.setAutor("juanito");
        Sw.setTitulo("Como pelear con un canguro ");
        Sw.setAño(2023);
        Sw.setNomweb(" WIKihow");
        Sw.setCiudad("Chihuahua");
        Sw.setMes("Febrero");
          Sw.setURL("WIKIHOW.com");
          System.out.println("Autor del sitio    "+Sw.getAutor());
          System.out.println("titulo    "+Sw.getTitulo());
          System.out.println("Año de crecion    "+Sw.getAño());
          System.out.println("Nombre de lapagina   "+Sw.getNomweb());
          System.out.println("Lugar de crecion   "+Sw.getCiudad());
          System.out.println("mes decreacio     "+Sw.getMes());
          System.out.println("URL    "+Sw.getURL());
    }
}
