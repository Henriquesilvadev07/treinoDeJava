import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class exercicio27ddd {
    public static String getDddInfo(int ddd) throws Exception {
        String url = "https://brasilapi.com.br/api/ddd/v1/" + ddd;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return response.body();
        } else {
            throw new RuntimeException("Falha ao buscar informações do DDD. Status: " + response.statusCode());
        }
}
