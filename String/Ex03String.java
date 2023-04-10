/*• Elabore um aplicativo que utiliza geração de números aleatórios para criar
frases. Utilize quatro arrays de strings chamados article, noun, verb e
preposition. Crie uma frase selecionando uma palavra aleatoriamente de
cada array na seguinte ordem: article, noun, verb, preposition, article e noun.
À medida que cada palavra é selecionada, concatene-a às primeiras palavras
na frase. As palavras devem ser separadas por espaços. Quando a frase final
for enviada para saída (tela), ela deve iniciar com uma letra maiúscula e
terminar com um ponto. O aplicativo deve gerar e exibir 20 frases.
• O array de artigos deve conter os artigos "the", "a", "one", "some" e "any"; o
array de substantivos deve conter os substantivos "boy", "girl", "dog", "town"
e "car"; o array de verbos deve conter os verbos "drove", "jumped", "ran",
"walked" e "skipped"; o array de preposições deve conter as preposições
"to", "from", "over", "under" e "on". */

import java.util.Random;

public class Ex03String {
    public static void main(String[] args){
        

        String[] articles = {"the", "a", "one", "some" , "any" };
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};
        Random r = new Random();

        String frase;

       for(int i = 0 ; i <20 ; i++){
        
            frase = articles[r.nextInt(0,4)] + " " 
            + noun[r.nextInt(0,4)] + " " 
            + verb[r.nextInt(0,4)] + " " +
            preposition[r.nextInt(0,4)] + " " 
            + articles[r.nextInt(0,4)] + 
            " " + noun[r.nextInt(0,4)];

            System.out.println(frase.toUpperCase().charAt(0) + frase.substring(1) + ".");

        }
    }
    
}