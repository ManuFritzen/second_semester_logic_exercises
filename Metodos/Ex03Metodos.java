/* Escreva um método calculaOperacao que receba por parâmetro dois
valores numéricos (float) e um símbolo.
• Esse símbolo representará a operação que se deseja efetuar com os
números. Assim, se o símbolo for “+”, deverá ser realizada uma
adição, se for “−”, uma subtração, se for “/”, uma divisão, e, se for “*”,
será efetuada uma multiplicação.
• Se um símbolo for inválido, o método imprime a mensagem “Símbolo
invalido!” e retorna -1;
• O programa principal deve ler do teclado os dois valores e o símbolo,
chamar o método criado e imprimir na tela o resultado da operação.
*/

package Metodos;

import java.util.Scanner;

public class Ex03Metodos {
    public static float calculaOperacao(float a, float b, char simbolo){
        float result;        

        if(simbolo == '+'){
            result = a+b;
        } else if (simbolo == '-'){
            result = a-b;
        } else if (simbolo == '/'){
            result = a/b;
        } else if (simbolo == '*'){
            result = a*b;
        } else {
            return -1;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("informe dois valores:");
        float a = in.nextFloat();
        float b = in.nextFloat();

        System.out.println("informe qualq a operação que você deseja efetuar: (+ ou - ou / ou *)");
        String operacao = in.next();

        float resultUsuario = calculaOperacao(a, b, operacao.charAt(0));

        if(resultUsuario==-1.0){
            System.out.println("ERRO!! informe um operador válido" );

        }else {
            System.out.println("o resultado da sua operação é: " + a + operacao.charAt(0) + b + " = " + resultUsuario );
        }

        


    }
    
}