/*Escreve três métodos sobrecarregados chamados inverter. O primeiro
método aceita um parâmetro do tipo String e retorna uma nova
String que é a versão invertida da original.
• O segundo método aceita três parâmetros: uma String, um índice de
início e um índice de fim. O método então retorna uma nova String
que é a versão da String original com os caracteres entre os índices de
início e fim invertidos.
• O terceiro método aceita um parâmetro do tipo array de caracteres e
retorna o array invertido.
• O programa principal deve fazer chamadas de método para os 3
métodos criados e mostrar na tela os resultados. */

public class Ex03MS {
    public static void main(String[] args){
        char[] arrayCara = {'e', 'm',  'a', 'n', 'u', 'e', 'l', 'l', 'e'};
        String result1 = inverter("Emanuelle");
        String result2 = inverter("Emanuelle", 2, 5);
        char[] result3 = inverter(arrayCara);

        System.out.println(result1 + " " + result2 );       

    } 

    public static String inverter(String s1){
        String invert = "";
        for (int i = s1.length() - 1;  i>=0 ; i--) {
            invert += s1.charAt(i);
        }
        return invert;
    }

    public static String inverter(String s1, int index1, int index2){
        String sub = s1.substring(index1, index2);
        String subInvert = inverter(sub);
        
        return subInvert;
    }

    public static char[] inverter(char[] arrayCarac){       
        char[] newArray = new char[arrayCarac.length];
        int contador = 0;
        for (int i = arrayCarac.length - 1;  i>=0 ; i--) {
            newArray[i] = arrayCarac[contador];
            System.out.print(newArray[i] + " ");
            contador++;
        }

        
        return newArray;
    }
    
}