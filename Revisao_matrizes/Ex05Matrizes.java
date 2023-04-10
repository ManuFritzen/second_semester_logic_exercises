/*Escreva um programa que preencha por leitura do teclado uma matriz
6 x 6.
• Trocar os elementos das colunas pares com os elementos das colunas
ímpares subsequentes (0 e 1, 2 e 3, até 4 e 5).
• Escrever na tela a matriz antes e depois troca.
• Não usar matriz auxiliar. */

import java.util.Scanner;

public class Ex05Matrizes{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[6][6];

        
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                System.out.println("Iforme o valor da matriz na posição linha: " + (i+1) + " coluna: " + (j+1) );
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("Matriz:");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " " );
            }
            System.out.println();
        }

        System.out.println("Matriz após a troca:");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                if(j%2==0){
                    System.out.print(matriz[i][j+1] + " " );
                } else {
                    System.out.print(matriz[i][j-1] + " " );
                }
            }
            System.out.println();
        }




            
    }
}
