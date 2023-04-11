
/*Escreva um método calculaFatorial que receba por parâmetro um
numero inteiro e retorne o fatorial deste número
• O programa principal deve ler do teclado o número, chamar o
método criado e imprimir na tela o resultado */

import java.util.Scanner;

public class Ex06Metodos {

    public static int fatorial(int a){
        int fatorial = 1;
        for(int i = 1 ; i <= a ; i++ ){
            fatorial = fatorial *i;
        }

        return fatorial;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("informe um número inteiro");

        int numeroUsuario = in.nextInt();

        int imprime = fatorial(numeroUsuario);

        System.out.println(imprime);
    }
    
}