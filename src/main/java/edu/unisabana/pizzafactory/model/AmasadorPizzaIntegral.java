
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class AmasadorPizzaIntegral implements Amasar {

    
    
    public void amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza con masa integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
