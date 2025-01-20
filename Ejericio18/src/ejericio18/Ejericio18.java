/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericio18;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejericio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,contador=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa un numero");
        numero=teclado.nextInt();
        while(numero!=0){
            contador=contador+1;
            numero=numero/10;
            
        }
        System.out.println("el numero de dijitos es"+contador);
    }
    
}
