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
public class MasaMargherita implements Masa{

    @Override
    public void costoMasa() {
        System.out.println("$ 5.99");
    }
    
}
