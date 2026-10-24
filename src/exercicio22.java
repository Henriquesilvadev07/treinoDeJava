public class exercicio22 {

    public static double aplicarDesconto(double precoOriginal, double quantidadeDesconto) {
        if (precoOriginal <= 0 || quantidadeDesconto <= 0) {
            return  precoOriginal;
        }

        double descontoFinal = precoOriginal * (quantidadeDesconto / 100.0);
        return precoOriginal - descontoFinal;
    }

    public static void main(String[] args) {
        double preco = 250.0;
        double desconto = 15.0;
        double precoFinal = aplicarDesconto(preco, desconto);

        System.out.printf("Preço original: R$ %.2f%n", preco);
        System.out.printf("Preço com %.0f%% de desconto: R$ %.2f%n", desconto, precoFinal);
    }


}
