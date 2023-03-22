/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma2numeros;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MostrarFrasesEnMayMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese la frase");
    
    frase=leer.nextLine();
    
        System.out.println(" la frase en mayuscula es: " + frase.toUpperCase()+"  la frase en minuscula es: "+frase.toLowerCase());
    
    
    
    }
    
    
    
    
}
