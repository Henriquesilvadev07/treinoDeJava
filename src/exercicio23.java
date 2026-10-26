import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Verificador de Senha ===");
        System.out.println("Digite sua senha (minimo de 8 caracteres, uma letra maiuscula e simbolos)");
        String senha = scanner.nextLine();
        System.out.println("==============================");
        System.out.println("Senha: " + senha);
        System.out.println("É forte? " + (isStrongPassword(senha) ? "Sim" : "Não"));

    }
    public static boolean isStrongPassword(String password) {
        if (password == null) {
            return false;
        }
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        return password.matches(regex);
    }

}
