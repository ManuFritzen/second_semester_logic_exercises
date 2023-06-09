/*• Escreva um método void validarNome que receba por parâmetro um
nome. Esse método verifica se o nome contém apenas letras. Caso
contrário ele deve lançar uma exceção NomeInvalidoException.
• Escreve um método contarPalavras que receba por parâmetro um
nome e retorna o número de palavras do nome. Caso o nome esteja
vazio, deve-se lançar uma exceção EmptyStringException.
• O método main deve ler via teclado o nome completo de uma
pessoa, chamar os métodos acima criados e imprimir o número de
palavras do nome. Ele deve tratar as exceções lançadas com as
seguintes mensagens: “Erro: Nome contém caracteres inválidos.”
"Erro: O nome não pode estar vazio." */

import java.util.EmptyStackException;
import java.util.Scanner;

public class Ex03 {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        try {
            validarNome(nome);
            int numPalavras = contarPalavras(nome);
            System.out.println(numPalavras + " palavras");
        } catch (NomeInvalidoException e) {
            System.out.println("Erro: Nome contém caracteres inválidos.");
        } catch (EmptyStackException e) {
            System.out.println("Erro: O nome não pode estar vazio.");
        }

    }

    public static void validarNome(String nome) throws NomeInvalidoException {
        if (!nome.matches("[a-zA-Z\\s]+")) {
            throw new NomeInvalidoException();
        }
    }

    public static int contarPalavras(String nome) {
        if (nome.isEmpty()) {
            throw new EmptyStackException();
        }
        String[] palavras = nome.split(" ");
        return palavras.length;
    }
    
}
