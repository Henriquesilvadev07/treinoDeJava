import java.util.Scanner;

public class exercicio16Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().trim().toLowerCase().replaceAll("\\s+", "");

        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println("----------------------------");
        if (texto.equals(invertido)){
            System.out.println("é Um Palindromo!");
        }else {
            System.out.println("Não é um Palindromo!");
        }
        System.out.println("------------------------------");
    }
}
