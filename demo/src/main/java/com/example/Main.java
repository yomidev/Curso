package com.example;

import java.util.Scanner;

public class Main {
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
                result = suma(num1, num2);
                System.out.println("La suma es: "+result);
            break;
            case "resta":
                resta(num1, num2);
            break;
            case "multiplicacion":
            result=multiplicacion(num1, num2);
            System.out.println("el resultado es "+result);
            break;
            case "division":
                while(!dividir(num2)){
                    System.out.println("Ingresa el numero 2:");
                    num2 = teclado.nextInt();
                }
                result = division(num1, num2);
                System.out.println("La division es: "+result);
           
            break;
            default:
            System.err.println("la operacion no existe");
        }
    }

    public static int suma(int x, int y){
        int resultado = x+y;
        return resultado;
    }
    public static void resta(int a, int b){
            int result=a-b;
            System.out.println("el resultado es "+result);
    }
    public static boolean dividir (int num2){
        if(num2 != 0){
            return true;
        }else{
            return false;
        }
    }
    public static int division(int a, int b){
        int resultado = a/b;
        return resultado;

    }
    public static int multiplicacion(int a, int b){
        int resultado=a*b;
        return resultado;
    }
}