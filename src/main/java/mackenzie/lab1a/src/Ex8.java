//Gabriel Ferreira
//RA: 10442043

package mackenzie.lab1a.src;

import java.util.Scanner;

public class Ex8 {
    public static boolean haColisaoEntreCirculos(double x1, double y1, double r1,
                                                 double x2, double y2, double r2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distancia = Math.sqrt(dx * dx + dy * dy);
        return distancia <= (r1 + r2);
    }

    public static void executar() {
        System.out.println("Exemplo fixo:");
        double x1Ex = 0, y1Ex = 0, r1Ex = 5;
        double x2Ex = 3, y2Ex = 4, r2Ex = 2;

        System.out.printf("Círculo 1 -> Centro: (%.2f, %.2f), Raio: %.2f\n", x1Ex, y1Ex, r1Ex);
        System.out.printf("Círculo 2 -> Centro: (%.2f, %.2f), Raio: %.2f\n", x2Ex, y2Ex, r2Ex);

        boolean colisaoExemplo = haColisaoEntreCirculos(x1Ex, y1Ex, r1Ex, x2Ex, y2Ex, r2Ex);
        System.out.println("Colisão entre círculos? " + colisaoExemplo);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAgora informe os dados dos dois círculos:");

        System.out.print("Círculo 1 - x: ");
        double x1 = scanner.nextDouble();
        System.out.print("Círculo 1 - y: ");
        double y1 = scanner.nextDouble();
        System.out.print("Círculo 1 - raio: ");
        double r1 = scanner.nextDouble();

        System.out.print("Círculo 2 - x: ");
        double x2 = scanner.nextDouble();
        System.out.print("Círculo 2 - y: ");
        double y2 = scanner.nextDouble();
        System.out.print("Círculo 2 - raio: ");
        double r2 = scanner.nextDouble();

        System.out.printf("\nCírculo 1 -> Centro: (%.2f, %.2f), Raio: %.2f\n", x1, y1, r1);
        System.out.printf("Círculo 2 -> Centro: (%.2f, %.2f), Raio: %.2f\n", x2, y2, r2);

        boolean colisao = haColisaoEntreCirculos(x1, y1, r1, x2, y2, r2);
        System.out.println("Colisão entre círculos? " + colisao);
    }
}