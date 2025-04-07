package mackenzie.lab1.src;

public class Ex5 {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void executar() {
        int a = 5, b = 10;
        System.out.println("Min entre " + a + " e " + b + ": " + min(a, b));
        System.out.println("Max entre " + a + " e " + b + ": " + max(a, b));
    }
}
