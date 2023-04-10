/*Faça um programa para ler do teclado 10 números diferentes a serem
armazenados em um vetor.
• Os números deverão ser armazenados no vetor na ordem em que
forem lidos, sendo que, caso o usuário digite um número que já foi
digitado anteriormente, o programa deverá pedir a ele para digitar
outro número.
• Note que cada valor digitado pelo usuário deve ser pesquisado no
vetor, verificando se ele existe entre os números que já foram
fornecidos.
• Exiba na tela o vetor final que foi digitado. */

import java.util.Scanner;

public class Ex05Vetores {
    public static <bollean> void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int[] vetor = new int[10];

            int elemento=1;

            System.out.println("digite o" + elemento + "º elemento do vetor");
            vetor[0] = in.nextInt();
            elemento++;

            int i =1;
            
            while(i<vetor.length){
                System.out.println("digite o " + elemento + "º elemento do vetor");
                vetor[i] = in.nextInt();
                boolean numerosIguais = false;

                for( int j = 0 ; j < i ; j++){
                    if(vetor[i]==vetor[j]){
                        System.out.println("Esse elemento já foi digitado, não vale repetir!");
                        numerosIguais = true;
                        break;
                    } 
                }
                if(numerosIguais){
                    continue;
                }else{
                    i++;
                    elemento ++;
                }
            }

            for( int j = 0; j< vetor.length; j++){
                System.out.print(vetor[j] + " ");
            }
        }
    }
}