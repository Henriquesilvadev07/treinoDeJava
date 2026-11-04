public class exercicio30 {
    public static String formatPhoneNumber(String phone) {
        if (phone == null) return "";

        // Mantém apenas os dígitos
        String digits = phone.replaceAll("\\D", "");

        // Formata celular com DDD (11 dígitos): (XX) XXXXX-XXXX
        if (digits.length() == 11) {
            return String.format("(%s) %s-%s",
                    digits.substring(0, 2),
                    digits.substring(2, 7),
                    digits.substring(7));
    }
}
