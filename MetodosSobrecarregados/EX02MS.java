/*• Escreva dois métodos sobrecarregados chamados contar. O primeiro
aceita um parâmetro do tipo String e retorna o número de caracteres
na string.
• O segundo método aceita um parâmetro do tipo array de caracteres e
retorna o número de elementos no array.
• O programa principal deve fazer chamadas de método para os 2
métodos criados e mostrar na tela os resultados. */

public class EX02MS {
    public static void main(String[] args)
     
    {
        char[] arrayCarac = {'a', 'b', 'c', 'd', 'e'};
        int result = contar("Emanuelle");
        int result2 = contar(arrayCarac);

        System.out.println(result +" "+result2);

    }

    public static int contar(String s1){
        int quantCaracteres = s1.length();

        return quantCaracteres;
    }

    public static int contar(char[] caracteres){
        int numeroElementos = caracteres.length;
        return numeroElementos;
    }
    
}