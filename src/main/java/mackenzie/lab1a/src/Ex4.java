//Gabriel Ferreira
//RA: 10442043

package mackenzie.lab1a.src;

import java.util.Scanner;

public class Ex4 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números na ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
