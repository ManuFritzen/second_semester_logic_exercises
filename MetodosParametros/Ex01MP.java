
/*Escreve um método somaElementosVetor que receba por parâmetros um
vetor contendo N valores inteiros e retorne a soma dos elementos
• Escreve um método multiplicaElementosVetor que receba por parâmetros
um vetor contendo N valores inteiros e retorne a multiplicação dos
elementos
• Escreva um método calculaMaior que receba por parâmetros um vetor
contendo N valores inteiros e retorne o maior elemento
• Escreve um método numeroRepeticaoMaior que receba por parâmetros
um vetor contendo N valores inteiros e retorne o número de vezes que o
maior elemento ocorreu no vetor. Dentro deste método, faça chamada ao
método calculaMaior
• O programa principal deve solicitar ao usuário o tamanho N do vetor, ler
via teclado os elementos do vetor, chamar os 4 métodos criados e mostrar
na tela os resultados */

import java.util.Scanner;

public class Ex01MP{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("informe o tamanho do vetor:");
        int tamanho = in.nextInt();
        int[] vetor = new int[tamanho];

        for(int i =0 ; i < vetor.length ; i++){
            System.out.println("Informe o valor do  " + i+1 +" elemento do vetor:");

            vetor[i] = in.nextInt();
        }

        int somaElementos = somaElementosVetor(vetor);
        int multiplicaElementos = multiplicaElementosVetor(vetor);
        int maiorElemento = calculaMaior(vetor);
        int repeteMaiorElemento = numeroRepeticaoMaior(vetor);

        System.out.println("A soma dos elementos é: " + somaElementos + "\nA multiplicação dos elementos é:  " +
        multiplicaElementos + "\n O maior elemento é: " + maiorElemento + "\n O maior elemento ocorre " + repeteMaiorElemento + " vezes");
 

    }

    public static int somaElementosVetor(int[] n){
        
        int soma =0;
        for(int i=0 ; i<n.length; i++){
            soma = soma + n[i];
        }

        return soma;
    }

    public static int multiplicaElementosVetor(int[] n){
        int multi=1;

        for(int i=0 ; i<n.length; i++){
            multi = multi * n[i];
        }

        return multi;
    }

    public static int calculaMaior(int[] n){
        int maior = n[0];

        for(int i=0 ; i<n.length; i++){
            if(n[i] > maior){
                maior = n[i];
            }
        }

        return maior;
    }

    public static int numeroRepeticaoMaior(int[] n){
        int repeticao =0;

        for(int i=0 ; i<n.length; i++){
            if(n[i] == calculaMaior(n)){
                repeticao++;
            }
        }

        return repeticao;
    }




}
