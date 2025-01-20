/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double lado,area,perimetro;
        System.out.println("ingrese la medida de un lado");
        lado=teclado.nextDouble();
        area=lado*lado;
        perimetro=lado*4;
        System.out.println("el area es"+area);
        System.out.println("el perimetro es:"+perimetro);
    }
    
}
