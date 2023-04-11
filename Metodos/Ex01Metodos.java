/*Escreva um método calculaPotencia(base, exponente) que receba por
parâmetros dois valores inteiros base e exponente e calcule e retorne
o resultado de baseexponente para o programa principal.
• Não utilize métodos da classe Math.
• Use uma estrutura de repetição.
• O programa principal deve solicitar ao usuário os valores inteiros para
base e exponente, chamar o método calculaPotencia e mostrar na
tela o resultado da operação. */

import java.util.Scanner;

public class Ex01Metodos {

    public static int calculaPotencia(int base, int expoente) {
        int contador = 1;
        int result=1;

        while(contador <= expoente){
            result = result*base;
            contador++;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("informe o valor da base:");
        int baseUsuario = in.nextInt();

        System.out.println("informe o valor do expoente:");
        int expoenteUsuario = in.nextInt();

        int calculo = calculaPotencia(baseUsuario, expoenteUsuario);

        System.out.println("resultado = " + calculo);

    }
}
