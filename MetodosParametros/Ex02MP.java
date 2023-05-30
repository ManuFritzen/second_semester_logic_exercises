
/*Escreve um método void modificaVetor que receba por parâmetros
um vetor contendo N valores inteiros e modifica da seguinte forma
• Os elementos de índices pares serão multiplicados por 2
• Os elementos de índices ímpares serão multiplicados por 3
• Escreva um método void printVetor para imprimir o vetor na tela
• O programa principal deve solicitar ao usuário o tamanho N do vetor,
ler via teclado os elementos do vetor, chamar os métodos printVetor,
modificaVetor e printVetor, nesta ordem. */
import java.util.Scanner;

public class Ex02MP {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("informe o tamanho do vetor:");
        int tamanho = in.nextInt();
        int[] vetor = new int[tamanho];

        for(int i =0 ; i < vetor.length ; i++){
            System.out.println("Informe o valor do  " + (i+1) +" elemento do vetor:");

            vetor[i] = in.nextInt();
        }

        printVetor(vetor);
        modificaVetor(vetor);
        printVetor(vetor);


    }

    public static void modificaVetor(int[] n){
        for(int i = 0; i<n.length ; i++){
            if(i % 2 == 0){
                n[i] = n[i]*2;
            } else {
                n[i]=n[i]*3;
            }
        }
    }

    public static void printVetor(int[] n){
        for(int i =0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println("");
    }
    
}