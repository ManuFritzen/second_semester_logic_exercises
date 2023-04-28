/*Faça um programa que leia do teclado dois números inteiros L e C e
preencha uma matriz A de L linhas e C colunas.
• Crie uma matriz T que armazenará a transposta de A.
• Imprima na tela a matriz A e a matriz T. */

import java.util.Scanner;

public class Ex04Matrizes{
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int l, c;

            System.out.println("Informe primeiro o número de Linhas e após o número de colunas  que tem na sua matriz:");
            l = in.nextInt();
            c = in.nextInt();

            int[][] matrizA = new int[l][c];

            for(int i = 0; i<l; i++){
                for(int j = 0; j<c; j++){
                    System.out.println("Iforme o valor da matriz na posição linha: " + (i+1) + " coluna: " + (j+1) );
                    matrizA[i][j] = in.nextInt();
                }
            }
            System.out.println("Matriz A:");
            for(int i = 0; i<l; i++){
                for(int j = 0; j<c; j++){
                    System.out.print(matrizA[i][j] + " " );
                }
                System.out.println();
            }

            int[][] matrizT = new int[c][l];


            System.out.println("Matriz T:");

            for(int i = 0; i<c; i++){
                for(int j = 0; j<l; j++){
                    matrizT[i][j] = matrizA[j][i];
                    System.out.print(matrizT[i][j] + " " );
                }
                System.out.println();

            }
        }

    }
}