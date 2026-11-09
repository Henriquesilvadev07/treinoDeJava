public class exercicio33 {

    public static long calcular(int n){
        if (n < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
