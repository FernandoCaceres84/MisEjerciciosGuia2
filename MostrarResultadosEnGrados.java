/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Dada una cantidad de grados centígrados se debe mostrar
//su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

package suma2numeros;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MostrarResultadosEnGrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double Gc;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los grados Centigrados");
        Gc=leer.nextDouble();
        double F = 32 + (9 * Gc/ 5);
        System.out.println("la conversion es:  " + F+ " Fº " );
        
    }
    
}
