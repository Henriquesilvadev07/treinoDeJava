import java.util.Locale;
import java.text.NumberFormat;

public class exercicio08 {
    public static String formatarReais(double valor) {
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
        return formatoMoeda.format(valor);
    }

    public static void main(String[] args) {
        double valorExemplo = 1540.50;
        System.out.println("Valor formatado: " + formatarReais(valorExemplo));
        // Saída esperada: R$ 1.540,50
    }
}

