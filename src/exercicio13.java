import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println("O ano " + year + " é BISSEXTO!");
        } else {
            System.out.println("O ano " + year + " NÃO é bissexto.");
        }
    }
}
