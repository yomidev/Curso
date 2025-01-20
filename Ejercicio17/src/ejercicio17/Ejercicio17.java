/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dia, mes;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa el dia de tu cumpleaños:");
       dia = teclado.nextInt();
       while(dia <=0 || dia > 31){
        System.out.println("Ingresa el dia de tu cumpleaños:");
        dia = teclado.nextInt();
       }
       do { 
           System.out.println("Ingresa el mes de nacimiento: ");
           mes = teclado.nextInt();
       } while (mes <= 0 || mes >12);

       if((mes == 3 || mes == 4) &&(dia <=21)){
            System.out.println("Aries");
       }else if((mes == 4 || mes == 5) &&(dia <=25)){
        System.out.println("Tauro");
       }else if((mes == 5 || mes == 6) &&(dia <=22)){
        System.out.println("Geminis");
       }else if((mes == 6 || mes == 7) &&(dia <=23)){
        System.out.println("Cancer");
       }else if ((mes == 7 || mes == 8) &&(dia <=24)) {
           System.out.println("Leo");
       }else if ((mes == 8 || mes == 9) &&(dia <=24)) {
           System.out.println("Virgo");
       }else if ((mes == 9 || mes == 10) &&(dia <=21)) {
           System.out.println("Escorpio");
       }else if ((mes == 10 || mes == 11) &&(dia <=21)) {
           System.out.println("Sagitario");
       }
    }
    
}
