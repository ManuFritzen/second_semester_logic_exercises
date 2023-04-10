/*Elabore um programa que preencha por leitura do teclado uma
matriz M de tamanho 3 × 3 de números inteiros.
• Em seguida, crie um vetor V de três posições, em que cada posição
deverá armazenar a soma dos números de cada coluna da matriz.
• Exiba na tela a matriz M e o vetor V.
• Por exemplo, a matriz
5 -8 10
1 2 15
25 10 7

• deverá gerar o vetor
31 4 32
*/

import java.util.Scanner;

public class Ex03Matrizes{
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int[][] matrizM = new int[3][3];

            int[] vetor = {0, 0, 0};

            for(int i=0; i<matrizM.length; i++){
                for(int j=0; j<matrizM.length; j++){
                    matrizM[i][j] = in.nextInt();               
                
                    vetor[j] += matrizM[i][j];
                    
                }
            }

            for(int i =0; i<vetor.length; i++){
                System.out.print(vetor[i] + " ");
            }
        }

        
    }
}