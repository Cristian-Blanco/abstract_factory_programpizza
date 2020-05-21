/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import abstractEntities.Ingredientes;
import abstractEntities.Masa;
import abstractEntities.Pizza;
import abstractEntities.Salsa;
import fabricasConcretas.*;
import java.util.Scanner;

/**
 *
 * @author jackl
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int op;
        do{
            op=menu();
            switch(op){
                case 1:
                    Costo(new Champignon());
                    break;
                case 2:
                    Costo(new Chicago());
                    break;
                case 3:
                    Costo(new Hawaiana());
                    break;
                 case 4:
                    Costo(new Margherita());
                    break;
                 case 5:
                    Costo(new Napolitana());
                    break;
                 case 6:
                    Costo(new Pepperoni());
                    break;
                 case 7:
                    System.out.println("Cerrando Programa");
                    System.exit(0);
                 default :
                    System.out.println(".....Opcion invalida....");
            }//cierra switchn\n
            //System.out.println("\n\n");
        }while(op!=7);

     }
    
    
    public static void Costo(Pizza eleccion){
        Salsa sauce = eleccion.obtenerCostoSalsa();
        Masa mass = eleccion.obtenerCostoMasa();
        Ingredientes food = eleccion.obtenerCostoIngredientes();
        System.out.println("El costo de la salsa es: ");
        sauce.costoSalsa();
        System.out.println("El costo de la masa es: ");
        mass.costoMasa();
        System.out.println("El costo de los ingredientes es: ");
        food.costoIngredientes();
        
    }
    
    public static int  menu(){
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Solicitar costos componentes pizza de champiñones. \n"
                + "2.   Solicitar costos componentes pizza chicago. \n"
                + "3.   Solicitar costos componentes pizza de hawaiana. \n"
                + "4.   Solicitar costos componentes pizza de margherita. \n"
                + "5.   Solicitar costos componentes pizza de napolitana. \n"
                + "6.   Solicitar costos componentes pizza de peperoni. \n"        
                + "7.   Cerrar programa. \n\n"
                + "Seleccion opcion..."
        );
        return Integer.parseInt(sc.nextLine());
    }
}
