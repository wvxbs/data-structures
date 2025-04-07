package mackenzie.lab1b.src;

public class Ex1 {
    public static void executar() {
        Palindromo p = new Palindromo("A sacada da casa");
        System.out.println("Texto: " + p.getTexto());
        System.out.println("É palíndromo? " + p.verificar());
    }
}