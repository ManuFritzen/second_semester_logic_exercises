/*Escreva um método isMultiple que receba por parâmetro um par de
inteiros e determine se o segundo inteiro é um múltiplo do primeiro,
ou seja, retorna true se o segundo for um múltiplo do primeiro e false
caso contrário.
• Faça um programa que lê via teclado uma série de pares inteiros (um
par por vez), determina e imprima na tela se o segundo valor em cada
par é um múltiplo do primeiro. */


package Metodos;

import java.util.Scanner;

public class Ex02Metodos {
    public static <bollean> boolean isMultiple(int a, int b){
        boolean result;
        if(b%a==0){
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos pares de interios você quer tester?");
        int quantPares = in.nextInt();
        int contador = 1;
        boolean resultUsuario;
        int a, b;

        while(contador <= quantPares){
            System.out.println("Informe o par de inteiros:");
            a = in.nextInt();
            b = in.nextInt();

            resultUsuario = isMultiple(a, b);
            
            System.out.println(resultUsuario);
        }
    }
    
}