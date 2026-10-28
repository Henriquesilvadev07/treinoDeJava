public class exercicio25 {
    public static void main(String[] args) {
        double valorOriginal = 250.00;
        double valorFinal = aplicarDescontoProgressivo(valorOriginal);

        System.out.println("=== Calculadora de Desconto ===");
        System.out.printf("Valor Original: R$ %.2f%n", valorOriginal);
        System.out.printf("Valor com Desconto: R$ %.2f%n", valorFinal);
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
