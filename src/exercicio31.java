import java.util.UUID;

public class exercicio31 {
    public static String gerarIdUnico() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        String idUnico = gerarIdUnico();
        System.out.println("ID unico gerado: " + idUnico);
    }
}
