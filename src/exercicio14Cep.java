import java.util.Scanner;

public class exercicio14Cep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============= BUSCADOR DE CEP (JAVA HTTP CLIENT ===========)");
        System.out.println("Digite um CEP(Somente números!): ");
        String cep = sc.nextLine();

        String url = "https://viacep.com.br/ws/"+cep+"/json/";
    }
}
