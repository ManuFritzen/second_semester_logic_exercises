/* Escreva um método recursivo isPalindromo que verifica se duas palavras s1 e s2
são palíndromas mútuas, ou seja, se uma é igual à outra quando lida de traz
para frente. Inicio e fim são índices.
• boolean isPalindromo(String s1, String s2, int inicio, int
fim)
• Escreve um método sobrecarregado NÃO recursivo isPalindromo que verifica se
as palavras tem o mesmo tamanho, chama o método recursivo e retorna true
ou false caso as palavras sejam palíndromas.
• boolean isPalindromo(String s1, String s2)
• O método main deve ler as duas palavras via teclado, chamar o 2º método
sobrecarregado e imprimir na tela se palavras são palíndromas mútuas ou não.
• Exemplo: Se a primeira string for “amor” e a segunda string for “roma”, então a
saída do programa deve ser “São palíndromas mutuas”. */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        System.out.println("Digite a primeira palavra: ");
        s1 = in.nextLine();
        System.out.println("Digite a segunda palavra: ");
        s2 = in.nextLine();
        if (isPalindromo(s1, s2)) {
            System.out.println("São palíndromas mútuas.");
        } else {
            System.out.println("Não são palíndromas mútuas.");
        }
    }

    public static boolean isPalindromo(String s1, String s2, int inicio, int fim) {
        if (fim == 0) {
            return s1.charAt(inicio) == s2.charAt(fim);
        } else {
            return s1.charAt(inicio) == s2.charAt(fim) && isPalindromo(s1, s2, inicio + 1, fim - 1);
        }
    }

    public static boolean isPalindromo(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            return isPalindromo(s1, s2, 0, s1.length() - 1);
        }
    } 
}
