package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un texto: ");
        texto = teclado.nextLine();

        System.out.println("Longitud: "+ texto.length());
        System.out.println("Caracter: "+texto.charAt(6));
        System.out.println("Sub-String: "+ texto.substring(10));
        System.out.println("Mayusculas: "+ texto.toUpperCase());
        System.out.println("Minusculas: "+ texto.toLowerCase());
        System.out.println("Equals: "+ texto.equals("Hola mundo"));
        System.out.println("Contains: "+ texto.contains("$"));

        System.out.println("Valor Absoluto: "+ Math.abs(-7));
        System.out.println("Raiz Cuadrada: "+Math.sqrt(144));
        System.out.println("Max: "+ Math.max(9, -6));
        System.out.println(Math.log10(8));
        System.out.println(Math.random()*99);
    }
}