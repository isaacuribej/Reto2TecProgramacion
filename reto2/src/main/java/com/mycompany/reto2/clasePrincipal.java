/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto2;

import java.util.Scanner;

/**
 Isaac Esteban Uribe Jaramillo
 * Julio Cesar Buitrago Yepez
 **/
public class clasePrincipal {
    
    public static void main (String[] args){
        System.out.println("Hola mundo");
        int a =5;
        int b=4;
        System.out.println(Punto5(a,b));
        
    

    
    }
    //*aaaaaaaaaaaaaaaaaaaaaaaaaaaa//
    
    public static void Punto1(){
        int numeroTablas;
        numeroTablas=5;
        int numeroItems;
        numeroItems=4;
        int variable;
        for(int i=1;i<=numeroTablas;i++){
            for(int j=1;j<=numeroItems;j++){
                variable=i*j;
                System.out.println(i+ "x" + j +"="+ variable );

            }
        }
            
    
}
    
    public static void Punto2(){
        int primero=6;
            int cuadrado=1;
            primero*=2;
            int aux;
            System.out.println(cuadrado);
            for (int i=1;i<=primero;i++){
                if(i%2!=0 && i!=1){
                aux=i;
                System.out.println(cuadrado+=aux);
                }
            }
        
    }
    
    public static void Punto3(){
        Scanner scam = new Scanner(System.in);
        int impar = -1;
        int numero;
        System.out.println("Numero de cubos a calcular:");
        numero = scam.nextInt();

        for (int i = 1; i <= numero; i++) {

            impar = impar + 2;
            int suma = impar;
            for (int j = 2; j <= i; j++) {
                impar = impar + 2;
                suma = suma + impar;
            }
        System.out.println(suma);
        }
        
    }
    
    public static void Punto4(){
        System.out.println("Ingrese una cantidad:");

        Scanner entrada = new Scanner(System.in);
        double cantidad = entrada.nextDouble();

        int pesos = (int)  cantidad;
        System.out.println("pesos=" + pesos);

       int d100000 = pesos / 100000;
       if(d100000 > 0){
        System.out.println("Cien Mil=" + d100000);
       }
        int r100000 = pesos % 100000;
        
        int d50000 = r100000 / 50000;
        if(d50000 > 0){
        System.out.println("Cincuenta Mil=" + d50000);
        }
        int r50000 = r100000 % 50000;
        
        int d20000 = r50000 / 20000;
        if(d20000 > 0){
        System.out.println("Veinte Mil=" + d20000);
        }
        int r20000 = r50000 % 20000;    
              
        int d10000 = r20000 / 10000;
        if(d10000 > 0){
        System.out.println("Diez Mil=" + d10000);
        }
        int r10000 = r20000 % 10000;
        
        int d5000 = r10000 / 5000;
        if(d5000 > 0){
        System.out.println("Cinco Mil=" + d5000);
        }
        int r5000 = r10000 % 5000;
        
        int d2000 = r5000 / 2000;
        if(d2000 > 0){
        System.out.println("Dos Mil=" + d2000);
        }
        int r2000 = r5000 % 2000;

        
        int d1000 = r2000 / 1000;
        if(d1000 > 0){
        System.out.println("Mil=" + d1000);
        }
        int r1000 = r2000 % 1000;

        int d500 = r1000 / 500;
        if(d500 > 0){
        System.out.println("Quinientos=" + d500);
        }
        int r500 = r1000 % 500;

        int d200 = r500 / 200;
        int r200 = r500 % 200;
        if(d200 > 0){
        System.out.println("Doscientos=" + d200);
        }
        
        int d100 = r200 / 100;
        int r100 = r200 % 100;
        if(d100> 0){
        System.out.println("Cien=" + d100);
        }
        int d50 = r100 / 50;
        int r50 = r100 % 50;
        if(d50 > 0){
        System.out.println("Cincuenta=" + d50);
        }
        
    }
    
    public static int Punto5(int m , int nn){

        int l;
        l=(m-nn);
        int x=1;
        int y=1;
        int z=1;
        
        for(int i=1;i<=m;i++){
            x=(x*i);
        }
        for(int j=1;j<=nn;j++){
            y=(y*j);
        }
        for(int k=1;k<=l;k++){
            z=z*k;
        }
        return x/(y*(z));
        
    }
}
