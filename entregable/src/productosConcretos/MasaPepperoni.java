/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productosConcretos;

import abstractEntities.Masa;

/**
 *
 * @author jackl
 */
public class MasaPepperoni implements Masa{

    @Override
    public void costoMasa() {
        System.out.println("$ 3.99");
    }
    
}
