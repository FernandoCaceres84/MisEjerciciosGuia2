/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que pida tu nombre, 
//lo guarde en una variable y lo muestre por pantalla.

package suma2numeros;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class EscribirNombreYmostrarlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String nombre;
        System.out.println("ingrese su nombre");
        Scanner leer = new Scanner(System.in);
        nombre= leer.next();
        System.out.println("el nombre ingresado es: " + nombre);
        
        
    }
    
}
