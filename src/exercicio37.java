import java.util.Arrays;

public class exercicio37 {
    public static int[] inverter(int[] numeros) {
        if (numeros == null) {
            return new int[0];
        }
        int[] invertido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        return invertido;
    }

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        System.out.println("Original:  " + Arrays.toString(original));
        System.out.println("Invertido: " + Arrays.toString(inverter(original)));
    }
}
