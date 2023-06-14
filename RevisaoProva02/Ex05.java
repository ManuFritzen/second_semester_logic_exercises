/*
Escreva um método int calculaSoma que receba por parâmetro uma string
contendo uma sequência de números inteiros separados por vírgula e retorne a
soma dos números. Se a String estiver vazia, o método deve lançar uma exceção
do tipo StringVaziaException. Se ocorrer uma exceção ao converter um número
da String para inteiro, o programa deve lançar uma exceção do tipo
NumberFormatException.
• int calculaSoma(String sequencia) throws StringVaziaException, NumberFormatException
• O método main deve ler via teclado uma String contendo uma sequência de
números inteiros, chamar o método criado e imprimir a soma dos números
inteiros.
• Caso ocorra algum erro, o método main deve tratar as exceções lançadas com as
seguintes mensagens de erro: “Erro: A sequência não pode estar vazia” ou "Erro:
Digite uma sequência válida de números inteiros“.

 */
import java.util.Scanner;


public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sequencia;
        System.out.println("Digite uma sequência de números inteiros separados por vírgula: ");
        sequencia = in.nextLine();
        try {
            System.out.println("A soma dos números é: " + calculaSoma(sequencia));
        } catch (StringVaziaException e) {
            System.out.println("Erro: A sequência não pode estar vazia");
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite uma sequência válida de números inteiros");
        }
    }

    public static int calculaSoma(String sequencia) throws StringVaziaException, NumberFormatException {
        if (sequencia.isEmpty()) {
            throw new StringVaziaException();
        } else {
            String[] sequenciaSplit = sequencia.split(",");
            int soma = 0;
            for (int i = 0; i < sequenciaSplit.length; i++) {
                soma += Integer.parseInt(sequenciaSplit[i]);
            }
            return soma;
        }
    }
    
}
