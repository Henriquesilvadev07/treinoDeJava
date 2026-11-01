public class exercicio28 {
    public static void main(String[] args) {
        String instanceName = "EC2-Production";
        boolean isRunning = true;

        System.out.println("Instância: " + instanceName);

        if (isRunning) {
            System.out.println("Status: Running");
        } else {
            System.out.println("Status: Stopped");
        }
    }
}
