
/*Faça um método calculaNeperiano que calcule e retorne o número
neperiano e, e = 2,71828183, usando a série a seguir
• O método deve receber como parâmetro somente o número de
termos que serão somados, N. Note que quanto maior esse número,
mais próxima do valor e estará a resposta
• Use o método calculaFatorial do exercício anterior
• O programa principal deve ler via teclado o valor de N, usar o método
criado e imprimir na tela o resultado da série
• Exemplo: Se N for igual a 3, então a saída do programa deve ser:
“Numero neperiano = 2.666667” */

import java.util.Scanner;

public class Ex07Metodos {

    public static int fatorial(int a){
        int fatorial = 1;
        for(int i = 1 ; i <= a ; i++ ){
            fatorial = fatorial *i;
        }

        return fatorial;
    }
    
    public static double calculaNeperiano(int n){
        double soma = 0;

        for(int i = 0; i<=n; i++){
            soma = soma + 1/(double)fatorial(i);
        }

        return soma;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("informe um numero inteiro:");
        int numeroUsuario = in.nextInt();

        double e = calculaNeperiano(numeroUsuario);

        System.out.println(e);
    }
}
