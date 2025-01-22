package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double descuento=0, descuento2=0, suma=0;
        double [] productos;
        int n;
        Scanner teclado = new Scanner(System.in);
        int option;
        do {

        System.out.println("ingrese el numero de productos:");
        n=teclado.nextInt();
        productos= new double [n];

        for (int i = 0; i<productos.length; i++){
            System.out.println("Ingrese el precio del producto");
            productos[i]= teclado.nextDouble();
        }

        for(int i=0;i<productos.length;i++){
            suma = suma+ productos[i];
        }

        if(suma >300){
            descuento=suma*0.05;
        }

        for (int i = 0; i < productos.length; i++) {
            if(productos[i]>=100){
                descuento2=suma*.10;
                break;
            }
        }

        suma=suma-descuento-descuento2;

        System.out.println("El total de la compra es: "+suma);
        System.out.println("deseo continuar?");
        option=teclado.nextInt();
        suma = 0; descuento = 0; descuento2 = 0;
    }while(option!=0);
        
    }
}