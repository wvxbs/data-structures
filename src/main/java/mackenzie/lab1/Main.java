package mackenzie.lab1;

import java.util.Scanner;
import mackenzie.lab1.src.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 10;

        while(escolha != 0) {
            System.out.println("\n=== Lista de Exercícios ===");
            System.out.println("1 para Exercício 1.");
            System.out.println("2 para Exercício 2.");
            System.out.println("3 para Exercício 3.");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> Ex1.executar();
                case 2 -> Ex2.executar();
                case 3 -> Ex3.executar();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        };

        scanner.close();
    }
}