import java.util.Locale;
import java.text.NumberFormat;

public class exercicio08 {
    public static String formatarReais(double valor) {
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
        return formatoMoeda.format(valor);
    }


}

