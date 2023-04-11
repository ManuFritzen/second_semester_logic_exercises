/*Faça um programa que leia duas matrizes quadradas A e B, de ordem
N, fornecido pelo usuário, e verifique se ambas são inversas (ou seja,
a multiplicação de A por B é a matriz identidade). */

import java.util.Scanner;

public class Ex07Matrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a ordem das matrizes:");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.println("Iforme o valor da matriz A na posição linha: " + (i+1) + " coluna: " + (j+1) );

                a[i][j] = in.nextInt();               
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Iforme o valor da matriz B na posição linha: " + (i+1) + " coluna: " + (j+1) );

                b[i][j] = in.nextInt();               
            }
        }

        int[][] multi = new int[n][n];
        
            for(int i =0 ; i<n; i++){
                for(int j =0; j<n; j++){
                    multi[i][j] = 0;
                    int contador=0;
                    while(contador<n){
                        multi[i][j] += a[i][contador]*b[contador][j];
                        contador++;
                    }
                }
            }

        //for(int i =0 ; i<n; i++){
        //    for(int j =0; j<n; j++){
        //        System.out.print(multi[i][j] + " ");
        //    }
        //        System.out.println();
        //}

        boolean matrizIdentidade = true;

        for(int i =0 ; i<n; i++){
            
            for(int j =0; j<n; j++){
                if((i != j && multi[i][j] == 0) || (i==j && multi[i][j] == 1)){
                    matrizIdentidade = true;
                } else {
                    matrizIdentidade = false;
                    break;
                }
            }
            if(matrizIdentidade == false){
                System.out.println("não são inversas");
                break;
            }
        }

        if(matrizIdentidade==true){
            System.out.println("são inversas");
        }

        
    
    }
    
    
    }