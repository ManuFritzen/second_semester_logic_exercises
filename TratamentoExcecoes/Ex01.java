/*Escreva um programa (método main) que solicite ao usuário um
número N e preencha via teclado um array de N números inteiros.
• O método main deve tratar as seguintes exceções:
• Se o usuário digitar um valor não numérico, o programa deve ignorar o valor,
mostrar a mensagem “Valor inválido” e continuar solicitando que o usuário
digite o próximo número até preencher o array. (InputMismatchException)
• Escreva um método calculaMaior que receba por parâmetros apenas
um array contendo N valores inteiros e retorne o maior elemento.
• O método main deve chamar o método calculaMaior e imprimir na
tela o resultado. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("escolha um tamanho para o vetor:");
        int tamanho = in.nextInt();

        int[] vetor = new int[tamanho];

        for(int i = 0; i<tamanho; i++){
            try{
                System.out.println("informe o valor do vetor no índice " + i);
                vetor[i] = in.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Valor inválido");
                in.nextLine();
                i--;
            }
        }

        System.out.println("Maior = " + calculaMaior(vetor));

        

    }

    public static int calculaMaior( int[] vetor){
        int maior = vetor[0];

        for(int i = 1; i<vetor.length; i++){
            if(vetor[i]>maior){
                maior = vetor[i];
            }
        }       
        
        return maior;
    }
}
