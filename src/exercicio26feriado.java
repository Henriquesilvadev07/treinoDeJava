import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class exercicio26feriado {

    public static String getHolidays(int ano) throws Exception {
        String url = "https://brasilapi.com.br/api/feriados/v1/" + ano;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
}
