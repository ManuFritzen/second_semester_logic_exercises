/* • Escreva um algoritmo que leia o valor do raio de um círculo, calcule e
imprima a área do círculo correspondente.
• A área do círculo é π ∗ raio2
• Utilize a classe java.lang.Math para obter a constate PI.*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            float raio, area;

            System.out.println("informe o valor do raio de um circulo:");
            raio = in.nextFloat();


            area = (float)(Math.PI*raio*raio);

            System.out.printf("A area do circulo é: %.2f ", area);
        }
        
    }
}