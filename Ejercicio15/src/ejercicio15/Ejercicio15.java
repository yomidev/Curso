/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, suma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor inicial: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresa el valor final: ");
        num2 = teclado.nextInt();
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            if(i%2 != 0){
                suma = suma + i;
            } 
        }
        System.out.println("La suma es: "+suma);
    }
    
}
