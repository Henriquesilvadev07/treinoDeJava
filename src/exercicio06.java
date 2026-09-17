public class exercicio06 {
    public static boolean validarFormato(String cpf){
        if (cpf == null){
            return false;
        }

        String apenasNumeros = cpf.replace("\\D", "");
        return apenasNumeros.length() == 11;
    }

    public static void main(String[] args) {
        String cpfTeste = "123.456.789-09";
        boolean valido = validarFormato(cpfTeste);
        System.out.println("O CPF " +cpfTeste+ "é valido estruturalmente? "+valido);
    }

}
