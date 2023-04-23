/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_interfaces;

/**
 *
 * @author ProBook
 */
public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }




}
Class prueba implements IntC(){

}
interface IntA{
    void A();
}
interface IntB{
    public abstract void B();//equivale a void B();
}
interface IntC extends IntA, IntB{
    public abstract void C();
}
