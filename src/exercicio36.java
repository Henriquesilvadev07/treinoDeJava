public class exercicio36 {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero = 29;
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo!");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
