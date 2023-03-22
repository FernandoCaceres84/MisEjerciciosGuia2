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
public class Suma2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); 
        int n1, n2, resultado;
        
        System.out.println("ingrese el primer numero");
        
        n1= leer.nextInt();
        System.out.println("ingrese el segundo numero");
        
        n2= leer.nextInt();
        
        resultado= n1+n2;
        
        System.out.println("la suma es: " + resultado);
       

        
                 
                
    }
    
}
