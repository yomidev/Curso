/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        String s;
        System.out.println("Ingresa el numero de lineas: ");
        n = teclado.nextInt();
        System.out.println("ingrese el simbolo");
        s = teclado.next();
        while(n<=0){
            System.out.println("ingresa el valor de n");
            n= teclado.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s);
            }
            System.out.print("\n");
        }
    }
    
}
