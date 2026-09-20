import java.util.regex.Pattern;

public class exercicio07 {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isValido(String email) {
        if (email == null) {
            return false;
        }
        return PATTERN.matcher(email).matches();
    }

    public static void main(String[] args) {
        String emailTeste = "dev.java@email.com";
        System.out.println("O e-mail " + emailTeste + " é válido? " + isValido(emailTeste));
    }
}
