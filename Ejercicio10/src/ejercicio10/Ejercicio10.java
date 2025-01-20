/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*int numero;
        System.out.println("Ingresa un numero: ");
        numero = teclado.nextInt();
        if(numero > 10){
            System.out.println("El numero es mayor que 10");
        }else{
            System.out.println("El numero es menor que 10");
        }*/
        int edad;
        System.out.println("Ingresa tu edad: ");
        edad = teclado.nextInt();
        if(edad >=0 && edad<=3){
            System.out.println("Eres bebe");
        }else if(edad >= 4 && edad<=11){
            System.out.println("Eres niño");
        }else if(edad >=12 && edad <=17){
            System.out.println("Eres adolescente");
        }else if(edad >=18 && edad <=29){
            System.out.println("Eres Joven");
        }else if(edad >=30 && edad <=59){
            System.out.println("Eres adulto");
        }else if(edad < 0){
            System.out.println("No se pueden ingresar numero negativos");
        }else{
            System.out.println("Eres viejo");
        }

    }
    
}
