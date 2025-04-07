package mackenzie.lab1a.src;

import java.util.Scanner;

public class Ex6 {
    public static double mulComAdicao(double a, int b) {
        double resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        return b < 0 ? -resultado : resultado;
    }

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (real): ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número (inteiro): ");
        int b = scanner.nextInt();

        double resultado = mulComAdicao(a, b);
        System.out.println(a + " x " + b + " = " + resultado);
    }
}
