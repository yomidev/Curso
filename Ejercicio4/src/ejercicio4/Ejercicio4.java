/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.141516;
        double radio, area, perimetro;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la medida del radio del circulo: ");
        radio = teclado.nextDouble();

        //area = PI*(radio*radio);
        //area = PI*Math.pow(radio,2);
        area = Math.PI*Math.pow(radio, 2);
        perimetro = 2*Math.PI*radio;

        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: "+ perimetro);
    }
    
}
