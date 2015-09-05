/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladordepatos;

/**
 *
 * @author quinho
 */
public class PatoDeBorracha extends Pato {
    
    public PatoDeBorracha() {
        voadores = new NaoVoa();
    }
    
    @Override
    public void simular() {
        System.out.println("Eu sou um pato de borracha.");
    }
    
}
