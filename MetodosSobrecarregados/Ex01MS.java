/*Escreva três métodos sobrecarregados chamados calculaNotaFinal
com as seguintes assinaturas:
• double calculaNotaFinal(double prova1, double prova2)
• double calculaNotaFinal(double prova1, double prova2, double trab1)
• double calculaNotaFinal(double prova1, int peso1, double prova2, int peso2)
• O primeiro método calcula a média das duas provas, o segundo
métodos calcula a média ponderada com peso 3 para cada prova e
peso 4 para o trabalho. O terceiro método calcula a média ponderada
de duas provas de acordo com o peso passado como argumento.
• O programa principal deve fazer chamadas de método para os 3
métodos criados e mostrar na tela os resultados. */

public class Ex01MS{
    public static void main(String[] args){

        double calc1 = calculaNotaFinal(8.5, 9.7);
        double calc2 = calculaNotaFinal(10, 7.5, 4.6);
        double calc3 = calculaNotaFinal(9.2, 5, 5.6, 5);    
        
        System.out.printf("primeiro metodo: %.2f \nSegundo metodo: %.2f \n terceiro metodo: %.2f", calc1, calc2, calc3);
    }

    public static double calculaNotaFinal(double prova1, double prova2){
        double result = (prova1+prova2)/2;
        return result;
    }

    public static double calculaNotaFinal(double prova1, double prova2, double trab1){
        double result = (prova1*3+prova2*3+trab1*4)/10;
        return result;
    }

    public static double calculaNotaFinal(double prova1, int peso1, double prova2, int peso2){
        double result = (prova1*peso1+prova2*peso2)/(peso1+peso2);
        return result;
    }
}