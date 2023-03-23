/* Faça um programa que leia um vetor de 10 posições com valores
inteiros positivos.
• Verifique se existem valores iguais e os escreva na tela.
• Não usar vetor auxiliar.
• Exemplo:
• Se o vetor for igual a [1, 2, 3, 1, 4, 5, 5, 6, 7, 2], deve-se imprimir “1, 2, 5”.*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int[] vetor = new int[10];

            System.out.println("Informe os 10 elementos do vetor, devem ser inteiros positivos.");

            for(int i = 0; i< vetor.length; i++){
                vetor[i] = in.nextInt();

                while(vetor[i]<0){
                    System.out.println("Eu disse positivo!");
                    vetor[i] = in.nextInt();
                }
            }

            for(int i = 0; i< vetor.length; i++){

                int aux = i+1;
                for(int j = aux; j<vetor.length; j++){
                    if(vetor[i]==vetor[j]){
                        System.out.print(vetor[i]+","+" ");
                        break;
                    }
                }
            }
        }

    }
}