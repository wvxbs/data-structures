package mackenzie.lab1.src;

public class Ex7 {
    public static int contarVogais(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) contador++;
        }
        return contador;
    }

    public static void executar() {
        String texto = "Universidade Mackenzie";
        System.out.println("Texto: " + texto);
        System.out.println("Quantidade de vogais: " + contarVogais(texto));
    }
}
