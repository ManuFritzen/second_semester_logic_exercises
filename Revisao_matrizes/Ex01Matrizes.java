/*• Faça um programa que preencha por leitura do teclado uma matriz A
de tamanho 4 × 4.
• Em seguida, conte e escreva na tela quantos valores maiores do que
10 ela possui. */
import java.util.Scanner;

public class Ex01Matrizes{
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int[][] matrizA = new int [4][4];
            int contador=0;

            for(int i= 0 ; i < matrizA.length ; i++){
                
                for(int j = 0 ; j < matrizA.length ; j++){
                    System.out.println("Informe o elemento da linha:" + (i+1) + " e coluna: " + (j+1));
                    matrizA[i][j] = in.nextInt();
                    if(matrizA[i][j] > 10){
                        contador++;
                    };
                }
            }
            System.out.println("Matriz A:");

            for (int i = 0; i< matrizA.length; i++){
                for(int j = 0; j<matrizA.length; j++){
                    System.out.print(matrizA[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Essa matriz tem " + contador + " elementos maiores que 10");
        }
      
    }
}