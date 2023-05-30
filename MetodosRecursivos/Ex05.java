/*• Escreva um método recursivo que receba por parâmetro um array de
caracteres e um índice e imprima na tela os caracteres invertidos.
• void printReverse(char[] v, int i)
• O método main deve criar uma String S, converter essa String em um
array de caracteres e chamar o método criado.
• Dica: utilize o método toCharArray (aula 4).
 */

public class Ex05 {
    public static void main(String[] args){
        String s = "amor";

        char[] sArray = s.toCharArray();

        printReverse(sArray,s.length());
        System.out.println();

    }

    public static void printReverse(char[] v, int i){
        if(i !=0){
            System.out.print(v[i-1]);
            printReverse(v, (i-1));

        }
        
    }

 
}
