public class exercicio22 {

    public static double aplicarDesconto(double precoOriginal, double quantidadeDesconto) {
        if (precoOriginal <= 0 || quantidadeDesconto <= 0) {
            return  precoOriginal;
        }

        double descontoFinal = precoOriginal * (quantidadeDesconto / 100.0);
        return precoOriginal - descontoFinal;
    }

    public static void main(String[] args) {
    }


}
