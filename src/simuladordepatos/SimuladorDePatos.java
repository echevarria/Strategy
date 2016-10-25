package simuladordepatos;

import patos.Pato;
import patos.PatoCabecaVermelha;

/**
 *
 * @author quinho
 */
public class SimuladorDePatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pato donald;
        
        donald = new PatoCabecaVermelha();
        
        donald.disparaVoo();
        
    }
}