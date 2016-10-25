/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;

import voadores.VoaComAsas;

/**
 *
 * @author quinho
 */
public class PatoBranco extends Pato {
    
    public PatoBranco() {
        voadores = new VoaComAsas();
    }
    
    @Override
    public void simular() {
        System.out.println("Eu sou um pato de verdade.");
    }
    
}
