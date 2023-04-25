/*• Escreve um método void trocaVetor que receba por parâmetro um
vetor V de inteiros de tamanho N.
• Esse método deve percorrer o vetor V e realizar a TROCA de seus
elementos 2 a 2, no sentido ascendente.
• O método main deve
• solicitar ao usuário que digite o valor de N
• preencher por leitura do teclado o vetor de inteiros
• chamar a função criada e
• imprimir na tela o vetor resultante após as trocas.
• Exemplo: Se N for igual a 5 e o vetor V for [-3, 7, 11, 0, 8], então a
saída do programa deve ser [7, 11, 0, 8, -3]. */

import java.util.Scanner;

public class Ex02RP {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor:");
        int n = in.nextInt();
        int[] v = new int[n];

        System.out.println("Informe os valores do vetor:");

        for(int i = 0 ; i < v.length; i++){
            v[i] = in.nextInt();
        }

        trocaVetor(v);

    }

    public static void trocaVetor(int[] v){
        int aux = v[0];
        for(int i=0; i<v.length; i++){
            if(i==v.length-1){
                v[i]=aux;
            } else {
                v[i] = v[i+1];
            }
        }

        for(int i =0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
}