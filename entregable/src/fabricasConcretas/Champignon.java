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
import productosConcretos.IngredientesChampignon;
import productosConcretos.MasaChampignon;
import productosConcretos.SalsaChampignon;


public class Champignon implements Pizza{

    @Override
    public Salsa obtenerCostoSalsa() {
        return new SalsaChampignon();
    }

    @Override
    public Masa obtenerCostoMasa() {
        return new MasaChampignon();
    }

    @Override
    public Ingredientes obtenerCostoIngredientes() {
        return new IngredientesChampignon();
    }


    
    
}
