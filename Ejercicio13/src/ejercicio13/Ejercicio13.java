/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner  teclado = new Scanner(System.in);
       int dia;
       System.out.println("Ingrese el dia");
       dia = teclado.nextInt();
       switch (dia) {
           case 1:
               System.out.println("Lunes");
               break;
               case 2:
               System.out.println("Martes");
               break;
               case 3:
               System.out.println("Miercoles");
               break;
               case 4:
               System.out.println("Jueves");
               break;
               case 5:
               System.out.println("Viernes");
               break;
               case 6:
               System.out.println("Sabado");
               break;
               case 7:
               System.out.println("Domingo");
               break;
           default:
               System.out.println("El dia no existe");
       }
    }
    
}
