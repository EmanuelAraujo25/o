import java.util.Scanner;

public class CyberSegurancaGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha;

        System.out.println("=======================================");
        System.out.println(" CYBER QUEST: BANANANETE & ABACATUDO ");
        System.out.println("=======================================\n");

        System.out.println("No futuro, hackers dominaram a internet...");
        System.out.println("A única esperança são os heróis:");
        System.out.println("🍌 Banananete e 🥑 Abacatudo!\n");

        System.out.println("Eles precisam proteger os dados secretos da cidade.\n");

        // PRIMEIRA ESCOLHA
        System.out.println("Um e-mail suspeito chega no computador central.");
        System.out.println("O que eles devem fazer?");
        System.out.println("1 - Abrir o link imediatamente");
        System.out.println("2 - Verificar se o e-mail é confiável");

        escolha = sc.nextInt();

        if (escolha == 1) {

            System.out.println("\n💀 Era um ataque de phishing!");
            System.out.println("Os hackers roubaram as senhas da cidade.");
            System.out.println("GAME OVER.");

        } else if (escolha == 2) {

            System.out.println("\n✅ Boa escolha!");
            System.out.println("Banananete percebe que o e-mail era falso.\n");

            // SEGUNDA ESCOLHA
            System.out.println("Agora os heróis precisam criar uma senha segura.");
            System.out.println("Qual senha escolher?");
            System.out.println("1 - 123456");
            System.out.println("2 - B@n@n@2026!");

            escolha = sc.nextInt();

            if (escolha == 1) {

                System.out.println("\n💀 Senha muito fraca!");
                System.out.println("Os hackers quebraram a senha facilmente.");
                System.out.println("GAME OVER.");

            } else if (escolha == 2) {

                System.out.println("\n✅ Senha forte criada com sucesso!\n");

                // TERCEIRA ESCOLHA
                System.out.println("Abacatudo encontra um pendrive desconhecido.");
                System.out.println("O que fazer?");
                System.out.println("1 - Conectar no computador");
                System.out.println("2 - Levar para análise de segurança");

                escolha = sc.nextInt();

                if (escolha == 1) {

                    System.out.println("\n💀 O pendrive tinha um vírus!");
                    System.out.println("Toda a rede foi infectada.");
                    System.out.println("GAME OVER.");

                } else if (escolha == 2) {

                    System.out.println("\n✅ Excelente decisão!");
                    System.out.println("O vírus foi descoberto antes do ataque.\n");

                    // FINAL
                    System.out.println("🎉 BANANANETE E ABACATUDO SALVARAM A CIDADE!");
                    System.out.println("A internet está segura novamente!");
                    System.out.println("\nFIM DO JOGO.");

                } else {
                    System.out.println("\nEscolha inválida.");
                }

            } else {
                System.out.println("\nEscolha inválida.");
            }

        } else {
            System.out.println("\nEscolha inválida.");
        }

        sc.close();
    }
}