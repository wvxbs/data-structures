package mackenzie.lab1a.src;

import java.util.Scanner;

public class Ex2 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        if ("aeiou".indexOf(letra) != -1) {
            System.out.println("É uma vogal.");
        } else if (Character.isLetter(letra)) {
            System.out.println("É uma consoante.");
        } else {
            System.out.println("Não é uma letra.");
        }
    }
}
