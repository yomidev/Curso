/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingresa el dia actual: ");
        dia = teclado.nextLine();
        System.out.println("Hola " + nombre + " ¿Cómo estas?" + " El dia de hoy es: " + dia);
    }
    
}
