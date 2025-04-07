package mackenzie.lab1b.src;

import java.util.Scanner;

public class Ex2 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto para verificar se é palíndromo: ");
        String entrada = sc.nextLine();

        Palindromo p = new Palindromo(entrada);
        System.out.println("Texto: " + p.getTexto());
        System.out.println("É palíndromo? " + p.verificar());
    }
}