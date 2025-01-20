/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, resultado;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        num= teclado. nextInt();
        for (int i = 0; i <= 10; i++) {
            resultado= num * i;
            System.out.println(num+"*"+i+"="+ resultado);
        }
    }
    
}
