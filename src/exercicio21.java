import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exercicio21 {

    public static String generateProtocol(String prefixo) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
    }

    public static void main(String[] args) {

    }
}
