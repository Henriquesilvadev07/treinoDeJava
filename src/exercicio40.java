public class exercicio40 {
    public static int encontrarMaior(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio.");
        }
        int maior = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
}
