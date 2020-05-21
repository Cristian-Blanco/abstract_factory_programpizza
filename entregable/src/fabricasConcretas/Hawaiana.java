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
import productosConcretos.IngredientesHawaiana;
import productosConcretos.MasaHawaiana;
import productosConcretos.SalsaHawaiana;



/**
 *
 * @author jackl
 */
public class Hawaiana implements Pizza{
    @Override
    public Salsa obtenerCostoSalsa() {
        return new SalsaHawaiana();
    }

    @Override
    public Masa obtenerCostoMasa() {
        return new MasaHawaiana();
    }

    @Override
    public Ingredientes obtenerCostoIngredientes() {
        return new IngredientesHawaiana();
    }
    
   
    
}
