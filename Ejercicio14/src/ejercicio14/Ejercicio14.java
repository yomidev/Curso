/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1,num2,result;
        String ope;
        System.out.println("ingrese un numero");
        num1=teclado.nextInt();
        System.out.println("ingrese numero 2");
        num2=teclado.nextInt();
        System.out.println("ingresa la operacion");
        ope=teclado.next();
        switch(ope){
            case "suma":
            result=num1+num2;
            System.out.println("el resultado es "+result);
            break;
            case "resta":
            result=num1-num2;
            System.out.println("el resultado es "+result);
break;
case "multiplicacion":
            result=num1*num2;
            System.out.println("el resultado es "+result);
            break;
            case "division":
            if(num2>0){
                result=num1/num2;
                System.out.println("el resultado es "+result);
            }else{
                System.out.println("No se puede dividir entre cero");
            }
           
            break;
            default:
            System.err.println("la operacion no existe");
        }
    }
    
}
