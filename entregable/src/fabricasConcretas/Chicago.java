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
import productosConcretos.IngredientesChicago;
import productosConcretos.MasaChicago;
import productosConcretos.SalsaChicago;


public class Chicago implements Pizza{
    @Override
    public Salsa obtenerCostoSalsa() {
        return new SalsaChicago();
    }

    @Override
    public Masa obtenerCostoMasa() {
        return new MasaChicago();
    }

    @Override
    public Ingredientes obtenerCostoIngredientes() {
        return new IngredientesChicago();
    }
    
}
