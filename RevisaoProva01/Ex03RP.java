/*Escreva um programa que faça a criptografia de uma mensagem de texto
da seguinte forma: cada letra do texto é substituída por outra que se
apresenta N posições após ela no alfabeto. Se N for igual a 3, a letra A seria
substituída por D, B se tornaria E, e assim por diante.
• Após atingir a última letra do alfabeto, deve-se voltar para a primeira letra
do alfabeto. Portanto, a letra Y seria substituída por B.
• Somente as letras do alfabeto são substituídas (números, não). Considerar
letras maiúsculas e minúsculas.
• O método main deve ler via teclado uma mensagem de texto, as N
posições e imprimir na tela a mensagem codificada.
• Exemplo: Se N for igual a 3 e o texto for “O zoom da camera A1-0 era
potente.”, então a saída do programa deve ser: “R crrp gd fdphud D1-0 hud
srwhqwh.”
 */

import java.util.Scanner;

public class Ex03RP {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = 3;
        String text = "O zoom da camera A1-0 era potente";
        String result = "";

        for(int i = 0; i < text.length(); i++){
            int letra = text.charAt(i);
            if(letra >= 65 && letra <= 90){
                letra = letra + n;
                if(letra>90){
                    letra = letra -26;
                }
                result = result + (char)letra;
            } else if ( letra>=97 && letra <=122){
                letra = letra + n;
                if(letra>122){
                    letra = letra - 26;
                }
                result = result + (char)letra;
            } else {
                
                result = result + (char)letra;
            }
        }
        System.out.println(result);
    }
}