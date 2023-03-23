/*• Faça um programa que calcule a média final em uma disciplina.
• O usuário deverá informar o valor obtido em duas provas e em dois
trabalhos.
• A média final é a média ponderada de peso 0,3 para cada prova e 0,2
para cada trabalho.
• O programa deve exibir todas as notas informadas pelo usuário e o
valor da média final. */
import java.util.Scanner;
public class Ex01{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			float p1, p2, t1, t2, media;

			System.out.println("informe o valor da primeira prova e em seguida da segunda prova");
			p1 = in.nextFloat();
			p2 = in.nextFloat();

			System.out.println("agora informe o valor do primeiro trabalho e em seguida do segundo trabalho");
			t1 = in.nextFloat();
			t2 = in.nextFloat();

			media = (float) ((0.3*(p1+p2) + 0.2*(t1+t2)));

			System.out.printf("Suas notas: \nProva1: %f\nProva 2: %f\nTrabalho1: %f\nTrabalho2: %f\nMédia: %f", p1, p2, t1, t2, media);
		}



        
    }
}