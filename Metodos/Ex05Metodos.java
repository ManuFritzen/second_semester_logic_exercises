
/*Escreva 3 métodos para cada uma das seguintes tarefas:
• a) Calcule a parte inteira do quociente quando um número inteiro a é
dividido por outro número inteiro b
• b) Calcule o resto inteiro quando um inteiro a é dividido por um
inteiro b.
• c) Utilize os métodos desenvolvidos nos itens (a) e (b) para escrever
um método displayDigits que recebe um inteiro entre 1 e 99999 e o
exibe como uma sequência de dígitos separandos por espaços.
• Por exemplo, o inteiro 4562 deve aparecer como 4 5 6 2
• O programa principal deve ler do teclado um número inteiro e
chamar o método displayDigits. Caso o número não esteja no
intervalo de 1 a 99999, um novo número deve ser solicitado. */

import java.util.Scanner;


public class Ex05Metodos {
    public static int quociente(int a, int b){
        int quociente;
        quociente = a/b;
        return quociente;
    }

    public static int resto(int a, int b){
        return a%b;
    }

    public static void displayDigits(int n){
        
        String resposta = "";
        while(n > 0){
            
            int resto = resto(n, 10);
    
            n = quociente(n, 10);

            resposta = resto + " " + resposta;
        }
        System.out.println(resposta);


    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int numeroUsuario;
        do {
            System.out.println("Digite um número entre 1 e 9999");
            numeroUsuario = in.nextInt();
        }while(numeroUsuario < 1 || numeroUsuario > 99999);

        displayDigits(numeroUsuario);
    }
}
