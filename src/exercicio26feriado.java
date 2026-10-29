import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class exercicio26feriado {

    public static String getHolidays(int ano) throws Exception {
        String url = "https://brasilapi.com.br/api/feriados/v1/" + ano;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return response.body();
        } else {
            throw new RuntimeException("Falha ao buscar feriados. Status: " + response.statusCode());
        }
    }

    public static void main(String[] args) {
        try {
            int ano = 2026;
            String holidaysJson = getHolidays(ano);
            System.out.println("Feriados de " + ano + ":\n" + holidaysJson);
        } catch (Exception e) {
            System.err.println("Erro na requisição: " + e.getMessage());
        }
    }
}
