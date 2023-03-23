/*• Escreva um programa que leia do teclado um vetor X de inteiros de 10
elementos.
• Crie um vetor Y da seguinte forma.
• Os elementos de Y de índices pares receberão os respectivos elementos de X
multiplicados por 2.
• Os elementos de Y de índices ímpares receberão os respectivos elementos de
X multiplicados por 3.
• Mostre na tela o vetor Y. */

import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("informe os 10 elementos do vetor");
            int[] x = new int[10];
            
            for (int i = 0; i<x.length; i++){
                x[i] = in.nextInt();
            }

            int[] y = new int[10];

            for (int i = 0; i<y.length; i++){
                if(i%2==0){
                    y[i]=x[i]*2;
                } else {
                    y[i]=x[i]*3;
                }
            }

            for(int i = 0; i<y.length; i++){
                System.out.print(y[i] + " ");
            }
        }
    }
}