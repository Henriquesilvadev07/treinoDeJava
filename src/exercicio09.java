public class exercicio09 {

    public static int calcularDigito(String numeroBase) {
        int soma = 0;
        int peso = 2;

        // Percorre a string de trás para frente
        for (int i = numeroBase.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(numeroBase.charAt(i));
            soma += digito * peso;
            peso++;
            if (peso > 9) {
                peso = 2; // Reinicia o peso se passar de 9
            }
        }
        int resto = soma % 11;
        int resultado = 11 - resto;

        if (resultado > 9) {
            return 0;
        }
        return resultado;
    }
}
