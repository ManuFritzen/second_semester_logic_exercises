/*A multiplicação de dois números inteiros pode ser feita através de
somas sucessivas (por exemplo, 2 * 5 = 2 + 2 + 2 + 2 + 2).
• int mult(int A, int B)
• Crie um método recursivo que receba como parâmetro somente dois
números inteiros, A e B, e calcule e retorne a multiplicação destes
números através de somas sucessivas.
• O método main deve ler via teclado os valores de A e B, chamar o
método criado e imprimir na tela o resultado retornado pelo método */

import java.util.Scanner;
public class Ex03 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(mult(a, b));


    }

    public static int mult(int a, int b){
        int result = 0;

        if(a==0 || b==0){
            return 0;
        } else{
            result = result + a;
            return result + mult(a, (b-1));

        }
    }
    
}
