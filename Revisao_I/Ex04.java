/*Faça um programa para verificar se determinado número inteiro lido
é divisível por 3 ou 5, mas não simultaneamente pelos dois. */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int numero;
            

            System.out.println("Informe um número Inteiro");
            numero = in.nextInt();

            if(numero%3==0 && numero%5==0){
                System.out.println("não");
            }else if(numero%3==0 || numero%5==0){
                System.out.println("sim");        
            }else{
                System.out.println("não");
            }
        }

        ;
    }
    
}
