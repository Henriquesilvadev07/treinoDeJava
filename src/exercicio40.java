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
    public static int encontrarMenor(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio.");
        }
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int[] valores = {14, 3, 89, 22, -5, 47};
        System.out.println("Maior número: " + encontrarMaior(valores));
        System.out.println("Menor número: " + encontrarMenor(valores));
    }

}
