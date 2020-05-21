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
import productosConcretos.IngredientesMargherita;
import productosConcretos.MasaMargherita;
import productosConcretos.SalsaMargherita;


/**
 *
 * @author jackl
 */
public class Margherita implements Pizza{

    @Override
    public Salsa obtenerCostoSalsa() {
        return new SalsaMargherita();
    }

    @Override
    public Masa obtenerCostoMasa() {
        return new MasaMargherita();
    }

    @Override
    public Ingredientes obtenerCostoIngredientes() {
        return new IngredientesMargherita();
    }
    
}
