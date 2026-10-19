import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class exercicio15Economia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== BUSCADOR DE COTAÇÃO DE MOEDAS (rickLabs) ===");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Dólar (USD) para Real (BRL)");
        System.out.println("2 - Euro (EUR) para Real (BRL)");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();
        String parMoedas = (opcao == 2) ? "EUR-BRL" : "USD-BRL";

        String url = "https://economia.awesomeapi.com.br/json/last/" + parMoedas;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    }
}
