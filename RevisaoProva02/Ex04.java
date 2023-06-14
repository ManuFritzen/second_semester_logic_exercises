/*Escreva um método void validarData que receba por parâmetro uma
data. Esse método verifica se a data é válida, ou seja, está no formato
"dd/mm/aaaa“ e é uma data existente. Caso não esteja, ele deve
lançar uma exceção do tipo DataInvalidaException. Se a data estiver
vazia, ele deve lançar uma exceção do tipo DataVaziaException.
• void validarData(String data) throws DataVaziaException, DataInvalidaException
• O método main deve ler via teclado uma data, chamar o método
criado e imprimir "Data válida!“ se não ocorreu nenhum erro.
• Caso contrário, ele deve tratar as exceções lançadas com as seguintes
mensagens de erro: “Erro: A data não pode estar vazia” ou "Erro: A
data fornecida não está no formato correto“.
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data;
        System.out.println("Digite uma data: ");
        data = in.nextLine();
        try {
            validarData(data);
            System.out.println("Data válida!");
        } catch (DataVaziaException e) {
            System.out.println("Erro: A data não pode estar vazia");
        } catch (DataInvalidaException e) {
            System.out.println("Erro: A data fornecida não está no formato correto");
        }
    }

    public static void validarData(String data) throws DataVaziaException, DataInvalidaException {
        if (data.isEmpty()) {
            throw new DataVaziaException();
        } else {
            String[] dataSplit = data.split("/");
            if (dataSplit.length != 3) {
                throw new DataInvalidaException();
            } else {
                int dia = Integer.parseInt(dataSplit[0]);
                int mes = Integer.parseInt(dataSplit[1]);
                int ano = Integer.parseInt(dataSplit[2]);
                if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
                    throw new DataInvalidaException();
                }
            }
        }
    }
    
}
