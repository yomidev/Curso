/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio7;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la base");
        base = teclado.nextDouble();
        System.out.println("ingrese la altura");
        altura = teclado.nextDouble();
        area = (base*altura)/2;
        System.out.println("el area es: "+area);
        
    }
    
}
