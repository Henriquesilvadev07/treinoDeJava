public class exercicio20 {

    public static String formatSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        return String.format("%02d:%02d:%02d:", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        int duration = 3665;
        String formattedTime = formatSeconds(duration);

        System.out.println("Tempo total em segundos: " +duration);
        System.out.println("Tempo formatado: " +formattedTime);

    }
}
