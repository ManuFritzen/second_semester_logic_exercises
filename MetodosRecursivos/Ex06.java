/*Escreva um método recursivo que encontre e retorne o maior
elemento de um vetor de n inteiros.
• int encontraMaior(int v[], int tam)
• O método main deve ler via teclado o valor de n, preencher os
elementos por leitura do teclado, chamar o método criado e imprimir
na tela o maior elemento. */
import java.util.Scanner;
 

public class Ex06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int tam = in.nextInt();
        int[] vetor = new int[tam];

        for(int i = 0 ; i < vetor.length; i++){
            vetor[i] = in.nextInt();
        }

        System.out.println("maior: " + encontraMaior(vetor, tam));        
    }

    public static int encontraMaior(int v[], int tam){

        if(tam==1){
            return v[0];
        } else {
            int maior = encontraMaior(v, tam-1);
            if(maior < v[tam-1]){
                return v[tam-1];
            } else {
                return maior;
            }

        }

    }
    
}
