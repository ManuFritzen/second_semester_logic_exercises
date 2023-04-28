/*Faça um programa que calcule e imprima na tela uma matriz B de
tamanho 10 × 10, em que seus elementos são calculados da seguinte
forma:
• Se i < j, B[i][j] = 2i + 7j – 2
• Se i = j, B[i][j] = 3i^2 – 1
• Se i > j, B[i][j] = 4i^3 + 5j^2 + 1 */

import java.util.Scanner;

public class Ex02Matrizes {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
        }

        double[][] matrizB = new double[10][10];

        for(int i = 0; i<matrizB.length ; i++){
            for(int j = 0 ; j<matrizB.length ; j++){
                if(i<j){
                    matrizB[i][j] = 2*(i+1) + 7*(j+1) - 2;
                } else if (i==j){
                    matrizB[i][j]=Math.pow((3*(i+1)), 2)-1;
                } else {
                    matrizB[i][j]= Math.pow((4*(i+1)), 3) + Math.pow((5*(j+1)), 2) +1;
                }
            }
        }

        for(int i = 0; i< matrizB.length; i++){
            for(int j = 0; j<matrizB.length; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
    }
}

