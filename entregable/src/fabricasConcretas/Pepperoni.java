/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fabricasConcretas;

import abstractEntities.Ingredientes;
import abstractEntities.Masa;
import abstractEntities.Pizza;
import abstractEntities.Salsa;
import productosConcretos.IngredientesPepperoni;
import productosConcretos.MasaPepperoni;
import productosConcretos.SalsaPepperoni;



/**
 *
 * @author jackl
 */
public class Pepperoni implements Pizza{
    @Override
    public Salsa obtenerCostoSalsa() {
        return new SalsaPepperoni();
    }

    @Override
    public Masa obtenerCostoMasa() {
        return new MasaPepperoni();
    }

    @Override
    public Ingredientes obtenerCostoIngredientes() {
        return new IngredientesPepperoni();
    }

    
    
}
