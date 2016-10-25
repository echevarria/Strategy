/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;

import voadores.NaoVoa;

/**
 *
 * @author Avell B155 MAX
 */
public class PatoCabecaVermelha extends Pato {
    
    public PatoCabecaVermelha() {
        voadores = new NaoVoa();
    }
    
    @Override
    public void simular() {
        System.out.println("Eu sou um pato de borracha.");
    }
    
}
