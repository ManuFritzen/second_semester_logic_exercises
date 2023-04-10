/* Faça um programa que leia as dimensões de duas matrizes A e B, e
depois leia as duas matrizes.
• Se as matrizes forem de tamanhos compatíveis para multiplicação,
crie a matriz R resultante da multiplicação de A por B.
• Imprima na tela as matrizes A, B e R.*/

import java.util.Scanner;

public class Ex06Matrizes{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        int linhaA, colunaA, linhaB, colunaB;
        System.out.println("Informe primeiro o número de Linhas e após o número de colunas  que tem na sua matriz A:");
        linhaA = in.nextInt();
        colunaA = in.nextInt();
        System.out.println("Agora informe o número de Linhas e após o número de colunas  que tem na sua matriz B:");
        linhaB = in.nextInt();
        colunaB = in.nextInt();
        int[][] matrizA = new int[linhaA][colunaA];
        int[][] matrizB = new int[linhaB][colunaB];
        for(int i = 0; i<linhaA; i++){
            for(int j = 0; j<colunaA; j++){
                System.out.println("Iforme o valor da matriz A na posição linha: " + (i+1) + " coluna: " + (j+1) );
                matrizA[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i<linhaB; i++){
            for(int j = 0; j<colunaB; j++){
                System.out.println("Iforme o valor da matriz B na posição linha: " + (i+1) + " coluna: " + (j+1) );
                matrizB[i][j] = in.nextInt();
            }
        }

        int[][] multi = new int[colunaA][linhaB];
        if(colunaA == linhaB){
            for(int i =0 ; i<colunaB; i++){
                for(int j =0; j<linhaA; j++){
                    multi[i][j] = 0;
                    int contador=0;
                    while(contador<linhaA){
                        multi[i][j] += matrizA[i][contador]*matrizB[contador][j];
                        contador++;
                    }
                }
            }
            System.out.println("MatrizA:");
            for(int i = 0; i<linhaA; i++){
                for(int j = 0; j< colunaA; j++){
                    System.out.print(matrizA[i][j] + " " );
                }
                System.out.println();
            }
            System.out.println("MatrizB:");
            for(int i = 0; i<linhaB; i++){
                for(int j = 0; j<colunaB; j++){
                    System.out.print(matrizB[i][j] + " " );
                }
                System.out.println();
            }
            System.out.println("MatrizR:");
            for(int i = 0; i<colunaA; i++){
                for(int j = 0; j<linhaB; j++){
                    System.out.print(multi[i][j] + " " );
                }
                System.out.println();
            }
        } else {
            System.out.println("é impossível multiplicar essas matrizes.");
        }
    

    }
}

