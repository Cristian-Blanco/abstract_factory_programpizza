/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productosConcretos;

import abstractEntities.Salsa;

/**
 *
 * @author jackl
 */
public class SalsaPepperoni implements Salsa{

    @Override
    public void costoSalsa() {
        System.out.println("$ 7.99");
    }
    
}
