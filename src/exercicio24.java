public class exercicio24 {
    public static void main(String[] args) {

    }

    public static long measureTime(Runnable task) {
        Long startTime = System.currentTimeMillis();
        task.run();
    }
}
