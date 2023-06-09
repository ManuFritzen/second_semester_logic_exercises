/*Escreva um método double dividirNumeros que receba por parâmetro
dois números inteiros e retorne a divisão do primeiro número pelo
segundo.
• O método main deve solicitar que o usuário digite os dois números
inteiros, chamar o método criado e imprimir na tela o resultado.
• O método main deve tratar as seguintes exceções:
• Se ocorrer uma exceção ao ler um valor não numérico, o programa deve exibir
uma mensagem de erro "Erro: Número inválido fornecido." e solicitar ao
usuário que digite novamente os números. (InputMismatchException)
• Se o segundo número for zero, o método dividirNumeros deve lançar uma
exceção. A exceção é capturada no método main que mostra a mensagem
“Erro: Divisão por zero não é permitida.” (ArithmeticException) */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num1=0;
        int num2=0;
        
        int i=1;
        int j=1;        
        
        while(i ==1 || j==1){
            try{
                System.out.println("Digite dois números inteiros:");
                num1 = in.nextInt();
                i=0;
                num2 = in.nextInt();
                j=0;
            } catch(InputMismatchException e){
                System.out.println("Erro: Número inválido fornecido");
                in.nextLine();
    
            };
        }
        

        
        double result;

        
        result = dividirNumeros(num1, num2);
        System.out.println("divisão: " + result);
    }

    public static double dividirNumeros(int num1, int num2){
        double result = num1/num2;
        if(num2 == 0){
            throw new ArithmeticException("ERRO");
        }
        return result;
    }
}
