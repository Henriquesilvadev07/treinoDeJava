public class exercicio04 {

    public static double calcularJuros(double capital, double taxa, int meses) {
        return capital * (taxa / 100) * meses;
    }

    public static void main(String[] args) {
        double capitalInicial = 1000.0;
        double taxaMensal = 2.0; // 2% ao mês
        int meses = 6;

        double jurosTotal = calcularJuros(capitalInicial, taxaMensal, meses);
        double valorFinal = capitalInicial + jurosTotal;

        System.out.println("--- Simulador Fintech Simples ---");
        System.out.println("Capital: R$ " + capitalInicial);
        System.out.println("Juros gerados: R$ " + jurosTotal);
        System.out.println("Valor total a pagar: R$ " + valorFinal);
    }
}
