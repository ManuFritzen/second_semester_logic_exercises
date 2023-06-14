/*Escreva um método recursivo power(base, expoent) que, quando chamado, retorna base^expoente.
Por exemplo, power(3, 4) = 3 * 3 * 3 * 3. Assuma que expoente é um inteiro maior ou igual a 1.
Dica: o passo da recursão deve adotar o relacionamento base^expoente = base * base^(expoente - 1)
e a condiçãode terminação se manifesta quando expoent é igual a 1 porque base^1=base
Incorpore esse método em um programa que permita que o usuário insira a base e o expoent. */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base, expoent;
        System.out.println("Digite a base: ");
        base = in.nextInt();
        System.out.println("Digite o expoente: ");
        expoent = in.nextInt();
        System.out.println("O resultado é: " + power(base, expoent));
    }

    public static int power(int base, int expoent) {
        if (expoent == 1) {
            return base;
        } else {
            return base * power(base, expoent - 1);
        }
    }
    
}
