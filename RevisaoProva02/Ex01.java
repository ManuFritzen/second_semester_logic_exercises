/*Escreva um método recursivo que encontre e retorne a soma dos
elemento de um vetor de n inteiros.
• int soma(int v[], int tam)
• O método main deve ler via teclado o valor de n, preencher os
elementos por leitura do teclado, chamar o método criado e imprimir
na tela o resultado.
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Digite o tamanho do vetor: ");
        n = in.nextInt();
        int[] v = new int[n];
        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        System.out.println("A soma dos elementos do vetor é: " + soma(v, n));
    }

    public static int soma(int[] v, int tam) {
        if (tam == 1) {
            return v[0];
        } else {
            return v[tam - 1] + soma(v, tam - 1);
        }
    }
}