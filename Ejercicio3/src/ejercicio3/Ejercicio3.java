/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, multiplicacion, division ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor del numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingresa el valor del numero 2: ");
        numero2 = teclado.nextInt();

        suma = numero1+numero2;
        resta= numero1-numero2;
        multiplicacion = numero1*numero2;
        division=numero1/numero2;
        

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es:"+division);
    }
    
}
