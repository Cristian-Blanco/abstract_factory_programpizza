/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productosConcretos;

import abstractEntities.Ingredientes;

/**
 *
 * @author jackl
 */
public class IngredientesHawaiana implements Ingredientes{

    @Override
    public void costoIngredientes() {
        System.out.println("$ 9.99");
    }
    
}
