import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;

        System.out.println(celcius + " graus Celcius equivale a  "+fahrenheit+" graus Fahrenheit");
        scanner.close();

    }
}
