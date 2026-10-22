import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class exercicio21 {

    public static String generateProtocol(String prefixo) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        int randomDigits = ThreadLocalRandom.current().nextInt(1000, 9999);

        return String.format("%s-%s-%d", prefixo, timestamp, randomDigits);
    }

    public static void main(String[] args) {
        String ticketProtocol = generateProtocol("TICKET");
        System.out.println("protocolo gerado: "+ticketProtocol);

    }
}
