/*Faça um programa que leia a altura e o peso de uma pessoa. De
acordo com a tabela a seguir, verifique e mostre qual a classificação
dessa pessoa. */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            float altura, peso;

            System.out.println("Informe a altura: ");
            altura = in.nextFloat();

            System.out.println("Informe o peso: ");
            peso = in.nextFloat();

            if(altura < 1.20f){
                if(peso <= 60f){
                    System.out.println("Classificação A");
                } else if(peso <= 90f){
                    System.out.println("Classificação D");
                } else {
                    System.out.println("Classificação G");
                }
            } else if (altura <= 1.7f){
                if(peso <= 60f){
                    System.out.println("Classificação B");
                } else if(peso <= 90f){
                    System.out.println("Classificação E");
                } else {
                    System.out.println("Classificação H");
                }
            } else {
                if(peso <= 60f){
                    System.out.println("Classificação C");
                } else if(peso <= 90f){
                    System.out.println("Classificação F");
                } else {
                    System.out.println("Classificação I");
                };
            }
        }

        ;

    };
};
