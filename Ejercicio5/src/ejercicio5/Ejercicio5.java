/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area, perimetro, base, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar la base del rectangulo:");
        base = teclado.nextDouble();
        System.out.println ("ingrese la altura: ");
        altura=teclado.nextDouble();
        area = base*altura;
        perimetro = (base*2)+(altura*2);
        System.out.println("el area es igual:"+area);
        System.out.println("el perimetro es igual: "+ perimetro);
    }
    
}
