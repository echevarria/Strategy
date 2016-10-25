/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;

import voadores.Voadores;

/**
 *
 * @author quinho
 */
public abstract class Pato {
    
    Voadores voadores;
    
    public abstract void simular();
    
    public void disparaVoo() {
        voadores.voar();
    }
    
    public void nadar() {
        System.out.println("Estou nadando");
    }
        
}
