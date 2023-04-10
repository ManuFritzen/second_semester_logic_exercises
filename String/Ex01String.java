/*Faça um programa para ler do teclado uma linha de texto e um
caractere de pesquisa.
• Determinar o número de ocorrências do caractere no texto e imprima
na tela.
• Não converter a String para um array de caracteres. */

import java.util.Scanner;

public class Ex01String {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String text;

        System.out.println("Digite uma linha de texto:");
        text = in.nextLine();

        char caracter;

        System.out.println("Digite uma caracter");
        caracter = in.nextLine().charAt(0);

        int contador = 0;

        for(int i= 0; i < text.length(); i++){
    
            if(caracter == text.charAt(i)){
                contador++;
            }
        }
        
        System.out.printf("Foi encontrado %d letras %s na sua pesquisa.", contador, caracter);
    }
}