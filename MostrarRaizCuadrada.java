/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que lea un número entero 
//por teclado y muestre por pantalla el doble, 
//el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().


package suma2numeros;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MostrarRaizCuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num;
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        num=leer.nextInt();
        System.out.println("el doble del numero ingresado es: " + num*2 +
                "  eltriple del numero ingresado es: " + num*3 + " y la raiz cuadrada es: " + Math.sqrt(num));
    }
    
}
