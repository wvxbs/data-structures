package mackenzie.lab1b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 10;

        while(escolha != 0) {
            System.out.println("\n=== Lista de Exercícios ===");
            System.out.println("1 para Exercício 1.");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        };

        scanner.close();
    }
}