/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author ProBook
 */              //clase derivada extends clase base
                 //clase hijo extends Clase base
                 //SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {
    public String nControl;
    

    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }
}
