package mackenzie.lab1b;

import mackenzie.lab1b.src.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 10;

        System.out.println("=== Verificador de Palíndromos ===");
        System.out.println("Escolha um exercício para executar ou digite 0 para sair:");
        while(escolha != 0) {
            System.out.println("1 - Exemplo com texto fixo");
            System.out.println("2 - Entrada do usuário");
            System.out.print("Opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> Ex1.executar();
                case 2 -> Ex2.executar();
                case 0 -> escolha = 0;
                default -> System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}