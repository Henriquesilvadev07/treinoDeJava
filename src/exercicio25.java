public class exercicio25 {
    public static void main(String[] args) {

    }

    public static double aplicarDescontoProgressivo(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da compra nao pode ser negativo!");
        }
        double quantidadeDesconto;

        if (valor >= 500.0) {
            quantidadeDesconto = 0.15;
        } else if (valor >= 200.0) {
            quantidadeDesconto = 0.10;
        } else if (valor >= 100.0) {
            quantidadeDesconto = 0.05;
        } else {
            quantidadeDesconto = 0.0;
        }
        return valor * (1.0 - quantidadeDesconto);
    }
}
