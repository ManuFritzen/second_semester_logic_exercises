/*• Considere a definição da série harmônica abaixo:

Obs: imagem no pdf

• Escreva um programa que leia um número inteiro positivo n e
calcule Hn.
• Exemplo: Se n = 3, então o valor de Hn deve ser 1.833333. */

import java.util.Scanner;

public class Ex06Revisao {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int n;
            int cont = 2;
            float h = 1f;

            System.out.println("Informe um número inteiro: ");
            n = in.nextInt();

            while(cont <= n){
                h = (float)(h + 1f/cont);
                cont++;
            }

            System.out.println("H = " + h);
        }
    }
    
}
