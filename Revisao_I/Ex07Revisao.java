/*Faça um programa que leia um valor A e um valor N, e depois
imprima a soma dos N números inteiros a partir de A (inclusive).
• Caso N seja negativo ou ZERO, deverá ser lido um novo N.
• Exemplo: Se A = 10 e N = 5, deve-se mostrar “Soma = 60” (pois 10 +
11 + 12 + 13 + 14 = 60). */

import java.util.Scanner;

public class Ex07Revisao {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int a, n=1 ;

            System.out.println("Informe um valor para n maior que zero: ");
            n = in.nextInt();


            while(n<=0){
                System.out.println("Eu disse maior que zero: ");
                n = in.nextInt();
            };

            System.out.println("Agora informe um valor para A: ");
            a = in.nextInt();

            int soma=a ;
            int acres=1;

            for(int i=1; i<n; i++){
                soma = soma + a + acres;

                acres++;
            }

            System.out.println("Soma= " + soma);
        }




        

    }
    
}
