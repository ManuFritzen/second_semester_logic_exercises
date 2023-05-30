/*Escreva um método recursivo printArray que imprime na tela todos os
elementos em um array de inteiros, separados por espaços.
• void printArray(int[] v, int tam)
• O método main deve criar um array de inteiros e chamar o método
criado.*/

public class Ex04 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};

        printArray(array, array.length);

        System.out.println();


    }

    public static void printArray(int[] v, int tam){
        if(tam!=0){
            printArray(v, tam-1);
            System.out.print(v[tam-1] + " ");
        }
    }
    
}
