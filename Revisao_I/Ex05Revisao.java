/*Faça um programa que calcule e mostre na tela a soma dos 50
primeiros números pares maiores que zero. */

public class Ex05Revisao {
    public static void main(String[] args){
        int contador = 1;
        int  soma=0;
        

        while(contador <= 100){
            if(contador%2==0){
                soma = soma+contador;

                
            }   
            contador++;         

        }

        System.out.println("Soma = " + soma);
    }
    
}
