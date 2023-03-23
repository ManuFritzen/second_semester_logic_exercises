/*Faça um programa para ler do teclado 2 vetores, R de 5 elementos e S
de 10 elementos.
• Gere um vetor X que possua os elementos comuns a R e a S.
• Considere que no mesmo vetor não haverá números repetidos.
• Mostre na tela o vetor X.
• Exemplo:
• Se o vetor R for igual a [1, 2, 3, 4, 5] e o vetor S for [6, 7, 1, 8, 9, 10, 4, 3, 11,
12], deve-se mostrar “Vetor X = [1, 3, 4]”. */

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int[] vetorR = new int[5];
            int[] vetorS = new int[10];

            System.out.println("Informe os 5 elemetos, diferentes entre eles, do vetor R:");
            for(int i = 0; i<vetorR.length; i++){
                vetorR[i] = in.nextInt();                        
                for(int j =0 ; j <i ; j++){
                    while(vetorR[j]==vetorR[i]){
                        System.out.println("Eu disse elementos diferentes entre eles, escolha outro elemento:");
                        vetorR[i] = in.nextInt();             
                    }
                }
            }

            System.out.println("Agora informe os 10 elemetos, diferentes entre eles, do vetor S:");
            for(int i = 0; i<vetorS.length; i++){
                vetorS[i] = in.nextInt();
                for(int j =0 ; j <i ; j++){
                    while(vetorS[j]==vetorS[i]){
                        System.out.println("Eu disse elementos diferentes entre eles, escolha outro elemento:");
                        vetorS[i] = in.nextInt();                        
                    }
                }
            }

            int tamanhoVetorX=0;

            for(int i = 0 ; i<vetorR.length; i++ ){
                for(int j = 0 ; j<vetorS.length; j++){
                    if(vetorR[i] == vetorS[j]){
                        tamanhoVetorX ++;
                    }
                }
            }

            int[] vetorX = new int[tamanhoVetorX];
            int posicaoElemento=0;

            for(int i = 0 ; i<vetorR.length; i++ ){
                for(int j = 0 ; j<vetorS.length; j++){
                    if(vetorR[i] == vetorS[j]){
                       vetorX[posicaoElemento]= vetorR[i];
                       posicaoElemento ++;
                    }
                }
            }


            for(int i = 0 ; i<vetorX.length ; i++){
                System.out.print(vetorX[i] + " ");
            }
        }
    }
}