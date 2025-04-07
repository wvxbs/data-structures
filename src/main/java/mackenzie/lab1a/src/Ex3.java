package mackenzie.lab1a.src;

import java.util.Scanner;

public class Ex3 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número real: ");
            double num = scanner.nextDouble();
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
