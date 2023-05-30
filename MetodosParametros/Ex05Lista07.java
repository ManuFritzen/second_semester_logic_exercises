import java.util.Scanner;

public class Ex05Lista07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] poltronas = new boolean[10];
        int opcao;
        do {
            System.out.println("Escolha a classe desejada: ");
            System.out.println("1 - Primeira Classe");
            System.out.println("2 - Classe Econômica");
            System.out.println("0 - Sair");
            opcao = in.nextInt();
            if (opcao != 0) {
                if (opcao == 1) {
                    if (primeiraClasseCheia(poltronas)) {
                        System.out.println("Primeira classe cheia!");
                        if(classeEconomicaCheia(poltronas)){
                            System.out.println("A classe econômica também está cheia!");
                            System.out.println("Próximo voo em 3 horas!");
                            break;
                        } else{
                            System.out.println("Você aceita ficar na classe econômica?");
                            System.out.println("1 - Não");
                            System.out.println("2 - Sim");
                            int resposta = in.nextInt();
                            if (resposta == 2) {
                                opcao = 2;
                                atribuiPoltrona(poltronas, opcao);
                            }
                        }
                    } else {
                        atribuiPoltrona(poltronas, opcao);
                    }
                } else if (opcao == 2) {
                    if (classeEconomicaCheia(poltronas)) {
                        System.out.println("Classe econômica cheia!");
                        if(primeiraClasseCheia(poltronas)){
                            System.out.println("A primeira classe também está cheia!");
                            System.out.println("Próximo voo em 3 horas!");
                            break;
                        } else{
                            System.out.println("Você aceita ficar na primeira classe?");
                            System.out.println("1 - Não");
                            System.out.println("2 - Sim");
                            int resposta = in.nextInt();
                            if (resposta == 2) {
                                opcao = 1;
                                atribuiPoltrona(poltronas, opcao);
                            }
                        }
                    } else {
                        atribuiPoltrona(poltronas, opcao);
                    }
                } else {
                    System.out.println("Opção inválida!");
                }
            }
        } while (opcao != 0);
    }    
    public static boolean primeiraClasseCheia(boolean[] poltronas) {
        for (int i = 0; i < 5; i++) {
            if (!poltronas[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean classeEconomicaCheia(boolean[] poltronas) {
        for (int i = 5; i < 10; i++) {
            if (!poltronas[i]) {
                return false;
            }
        }
        return true;
    }
    public static void atribuiPoltrona(boolean[] poltronas, int opcao) {
        Scanner in = new Scanner(System.in);
        int poltrona;
        if (opcao == 1) {
            System.out.println("Escolha uma poltrona entre 1 e 5: ");
            poltrona = in.nextInt();
            if (poltrona >= 1 && poltrona <= 5) {
                if (poltronas[poltrona - 1]) {
                    System.out.println("Poltrona ocupada!");
                } else {
                    poltronas[poltrona - 1] = true;
                    System.out.println("Poltrona atribuída com sucesso!");
                }
            } else {
                System.out.println("Poltrona inválida!");
            }
        } else {
            System.out.println("Escolha uma poltrona entre 6 e 10: ");
            poltrona = in.nextInt();
            if (poltrona >= 6 && poltrona <= 10) {
                if (poltronas[poltrona - 1]) {
                    System.out.println("Poltrona ocupada!");
                } else {
                    poltronas[poltrona - 1] = true;
                    System.out.println("Poltrona atribuída com sucesso!");
                }
            } else {
                System.out.println("Poltrona inválida!");
            }
        }
    }
}
