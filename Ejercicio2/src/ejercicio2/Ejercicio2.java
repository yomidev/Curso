/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Arrays;

/**
 *
 * @author Yomi
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Numero Enteros
        byte num1 = 123;
        short num2 = 32300;
        int num3 = 10000000;
        long num4 = 5678L;

        //Numeros Flotates
        float num5 = 3.14F;
        double num6 = 3.1415167283738478348342342342342342342342342342342342;

        //CHAR
        char letra = 'a';
        //Boolean
        boolean prueba = false;

        //String
        String palabra = "NetBeans IDE es un entorno de desarrollo integrado, gratuito y de código abierto para el desarrollo de aplicaciones en los sistemas operativos Windows, Mac,";

        //Array 
        int [] serie = {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println("Byte: " + num1);
        System.out.println("Short: " + num2);
        System.out.println("Int: " + num3);
        System.out.println("Long: " + num4);
        System.out.println("Float: " + num5);
        System.out.println("Double: " + num6);

        System.out.println(letra);
        System.out.println(prueba);
        System.out.println("String: " + palabra);
        System.out.println("Array: " + Arrays.toString(serie));



    }
    
}
