public class exercicio19 {

    public static String getServiceType(String serviceName) {
        return switch (serviceName.toUpperCase()){
            case "EC2" -> "Servico nao gerenciado (IssS)";
            case "RDS" -> "Servico gerenciado (Managed)";
            case "LAMBDA","S3","DYNAMODB" -> "Servico totalmente gerenciado (Servless)";
            default -> "Servico nao reconhecido";
        };
    }

    public static void main(String[] args) {
        String service = "Lambda";
        String category = getServiceType(service);

        System.out.println("Serviço AWS: " +service);
        System.out.println("Categoria: " +category);

    }
}
