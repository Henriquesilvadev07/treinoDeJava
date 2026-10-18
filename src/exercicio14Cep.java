import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class exercicio14Cep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============= BUSCADOR DE CEP (JAVA HTTP CLIENT ===========)");
        System.out.println("Digite um CEP(Somente números!): ");
        String cep = sc.nextLine();

        String url = "https://viacep.com.br/ws/"+cep+"/json/";

        try {
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("\n--- Resposta da API (JSON) ---");
            System.out.println(response.body());
        }catch (Exception e){
            System.out.println("Erro ao buscar CEP: " +e.getMessage());

        }
    }
}
