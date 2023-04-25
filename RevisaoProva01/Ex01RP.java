/* • Escreve um método calculaFatorial que receba por parâmetro um número
inteiro n e retorne o fatorial deste número.
• Escreve um método converteEmRadianos que receba por parâmetro um
ângulo em graus (double) e retorne o ângulo em radianos.
• Escreva um método calculaSeno que receba por parâmetro o valor de um
ângulo G (em graus) e calcule e retorne o valor do seno desse ângulo
usando a sua respectiva série de Taylor:
• onde x é o valor do ângulo em radianos. O método main deve ler via
teclado o valor de G, chamar o método calculaSeno e imprimir na tela o
resultado da série. Exemplo: Se G = 60 graus, a saída é “Seno = 0.87”.*/

import java.util.Scanner;

public class Ex01RP {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor de um ângulo em graus:");
        double g = in.nextDouble();

        double result = calculaSeno(g);

        System.out.printf("Seno = %.2f", result );

    }

    public static  int calculaFatorial(int n){
        int fatorial = 1;

        while(n>0){
            fatorial = fatorial * n;

            n--;
        }

        return fatorial;
    }

    public static double converteEmRadianos(double anguloEmGraus){
        double radianos = (anguloEmGraus/180)*Math.PI;
        return radianos;
    }

    public static double calculaSeno(double g){
        double x = converteEmRadianos(g);
        double seno = x;
        int aux = 3;

        for(int i = 1; i < 5 ; i++){
            if(i % 2 != 0){
                seno = seno - Math.pow(x, aux)/ calculaFatorial(aux);                
            } else {
                seno = seno + Math.pow(x, aux)/ calculaFatorial(aux);                
            }
            aux = aux +2;
        }

        return seno;
    }






}