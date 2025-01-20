/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double compra, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de la compra");
        compra = teclado.nextDouble();
        if (compra >=500 && compra < 1000){
            resultado = compra * .20;
            compra = compra - resultado;
            System.out.println("El total es: " + compra);
        }else if(compra >= 1000 ){
            resultado = compra * .5;
            compra = compra - resultado;
            System.out.println("El total de la compra es:" +compra);
        }else{
            System.out.println("No aplica ");
        }

    }
    
}
