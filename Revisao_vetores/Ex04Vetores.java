/*• Modifique o exercício anterior para que a saída não mostre valores
repetidos.
• Exemplo:
• Se o vetor for igual a [1, 1, 1, 1, 1, 2, 1, 1, 1, 2], deve-se imprimir “1, 2”. */

import java.util.Scanner;

public class Ex04Vetores {
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

                int aux;
                for(int j = i+1; j<vetor.length; j++){
                    if(vetor[i]==vetor[j] && vetor[i]>0){
                        aux = vetor[j];
                        System.out.print(aux + " ");
                        
                        for(int l = 0; l<vetor.length; l++){
                            if(vetor[l]==aux){
                                vetor[l]=0;
                            }
                        }
                    }
                }

                


            }
        }

    }
}