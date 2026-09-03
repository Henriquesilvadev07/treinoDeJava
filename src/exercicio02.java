import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Dev em transiçao registrado: " + nome.toUpperCase());
        System.out.println("Status: focado no java e no futuro.");
        sc.close();
    }
}
