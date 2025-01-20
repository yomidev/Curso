/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,potencia;
        double resultado;
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
        System.out.println("Ingrese la potencia");
        potencia = teclado.nextInt();
        resultado = Math.pow(numero,potencia);
        System.out.println("La potencia es"+ resultado);
    }
    
}
