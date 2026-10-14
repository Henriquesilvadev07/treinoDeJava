import java.security.SecureRandom;
import java.util.Scanner;

public class exercicio10 {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("=== GERADOR DE SENHAS SEGURAS ===");
        System.out.print("Digite o tamanho da senha (ex: 12): ");
        int length = scanner.nextInt();

        System.out.print("Incluir letras maiúsculas? (s/n): ");
        boolean useUpper = scanner.next().equalsIgnoreCase("s");

        System.out.print("Incluir números? (s/n): ");
        boolean useNumbers = scanner.next().equalsIgnoreCase("s");

        System.out.print("Incluir caracteres especiais? (s/n): ");
        boolean useSpecial = scanner.next().equalsIgnoreCase("s");

        String password = generatePassword(length, useUpper, useNumbers, useSpecial, random);

        System.out.println("\n--------------------------------");
        System.out.println("Sua senha gerada: " + password);
        System.out.println("--------------------------------");

        scanner.close();
    }
}
