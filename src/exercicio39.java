public class exercicio39 {

    public static int contar(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0;
        }
        String[] palavras = frase.trim().split("\\s+");
        return palavras.length;
    }

    public static void main(String[] args) {

    }
}
