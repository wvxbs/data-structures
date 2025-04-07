package mackenzie.lab1.src;

import java.util.Scanner;

public class Ex1 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int valor2 = scanner.nextInt();

        int temp = valor1;
        valor1 = valor2;
        valor2 = temp;

        System.out.println("Valores trocados:");
        System.out.println("Valor 1 = " + valor1);
        System.out.println("Valor 2 = " + valor2);
    }
}