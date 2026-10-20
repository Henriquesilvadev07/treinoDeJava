import java.util.Scanner;

public class exercicio16Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().trim().toLowerCase().replaceAll("\\s+", "");
    }
}
