import java.util.Scanner;

public class exercicio19 {

    public static String getServiceType(String serviceName) {
        return switch (serviceName.toUpperCase()){
            case "EC2" -> "Servico nao gerenciado (IaaS)";
            case "RDS" -> "Servico gerenciado (Managed)";
            case "LAMBDA","S3","DYNAMODB" -> "Servico totalmente gerenciado (Servless)";
            default -> "Servico nao reconhecido";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do servico da AWS");
        String service = scanner.nextLine();
        String category = getServiceType(service);

        System.out.println("Serviço AWS: " +service);
        System.out.println("Categoria: " +category);

        scanner.close();

    }
}
