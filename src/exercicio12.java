import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double note1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double note2 = sc.nextDouble();

        double average = (note1 + note2) / 2;

        System.out.println("Média final: " + average);

        if (average >= 6.0) {
            System.out.println("Status: Aprovado!");
        } else {
            System.out.println("Status: Reprovado / Exame.");
        }
        sc.close();
    }
}
