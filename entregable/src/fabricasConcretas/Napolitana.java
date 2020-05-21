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
import productosConcretos.IngredientesNapolitana;
import productosConcretos.MasaNapolitana;
import productosConcretos.SalsaNapolitana;




/**
 *
 * @author jackl
 */
public class Napolitana implements Pizza{
    
    @Override
    public Salsa obtenerCostoSalsa() {
        return new SalsaNapolitana();
    }

    @Override
    public Masa obtenerCostoMasa() {
        return new MasaNapolitana();
    }

    @Override
    public Ingredientes obtenerCostoIngredientes() {
        return new IngredientesNapolitana();
    }
 
}
