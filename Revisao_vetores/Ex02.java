/*Crie um programa que leia do teclado um vetor U de 10 elementos.
• Utilize uma estrutura de repetição para trocar o 1o. elemento com o
último, o 2o. com o penúltimo, etc. até o 5o. com o 6o.
• Não usar vetor auxiliar.
• Imprima na tela o vetor U modificado.
 */

 import java.util.Scanner;

 public class Ex02{
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int[] u = new int[10];

            System.out.println("Informe os 10 elementos do vetor");

            for(int i = 0; i<u.length; i++){
                u[i] = in.nextInt();
            }
            for(int i = u.length-1; i>=0; i--){
                int aux = u[i];

                System.out.print(aux + " ");
            }
        }
        
    }
 }