/*Escreve um método ordemAlfabética que receba por parâmetros
duas palavras s1 e s2 e retorne uma String com as palavras em ordem
alfabética. Dica: Utilize o método compareTo da String.
• O programa principal deve ler as duas palavras via teclado e chamar o
método criado. Considere que as palavras podem ter letras
maiúsculas e/ou minúsculas.
• Ex1.: Se s1 for “caneta” e s2 for “caderno”, então a saída do programa
deve ser “caderno caneta”.
• Ex1.: Se s1 for “Aula” e s2 for “algoritmo”, então a saída do programa
deve ser “algoritmo Aula”.
 */

import java.util.Scanner;

public class Ex03MP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        s1 = in.nextLine();
        s2 = in.nextLine();

        System.out.println(ordemAlfabética(s1, s2));
    }

    public static String ordemAlfabética(String s1, String s2) {
        if (s1.compareTo(s2) < 0) {
            return s1 + " " + s2;
        } else {
            return s2 + " " + s1;
        }
    }
}
