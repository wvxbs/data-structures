package mackenzie.lab1a;

import java.util.Scanner;
import mackenzie.lab1a.src.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 10;

        while(escolha != 0) {
            System.out.println("\n=== Lista de Exercícios ===");
            System.out.println("1 para Exercício 1.");
            System.out.println("2 para Exercício 2.");
            System.out.println("3 para Exercício 3.");
            System.out.println("4 para Exercício 4.");
            System.out.println("5 para Exercício 5.");
            System.out.println("6 para Exercício 6.");
            System.out.println("7 para Exercício 7.");
            System.out.println("8 para Exercício 8.");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> Ex1.executar();
                case 2 -> Ex2.executar();
                case 3 -> Ex3.executar();
                case 4 -> Ex4.executar();
                case 5 -> Ex5.executar();
                case 6 -> Ex6.executar();
                case 7 -> Ex7.executar();
                case 8 -> Ex8.executar();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        };

        scanner.close();
    }
}