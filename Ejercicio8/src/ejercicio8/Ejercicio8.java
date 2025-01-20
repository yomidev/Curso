/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double numerolados, medida, perimetro;
        System.out.println(" Ingrese el numero de lados;");
        numerolados = teclado.nextDouble();
        System.out.println(" Ingrese la medida;");
        medida = teclado.nextDouble();
        perimetro = numerolados*medida;
        System.out.println(" El Perimetro es: "+ perimetro);

    }
    
}
