package mackenzie.lab1b.src;

public class Palindromo {
    private String texto;

    public Palindromo() {
        this.texto = "";
    }

    public Palindromo(String texto) {
        setTexto(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("Texto não pode ser nulo");
        }
        this.texto = texto;
    }

    public boolean verificar() {
        String normalizado = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reverso = new StringBuilder(normalizado).reverse();
        return normalizado.equals(reverso.toString());
    }
}
