public class exercicio24 {
    public static void main(String[] args) {
        System.out.println("======= Teste de Performance =======");
        Long executionTimeMs = measureTime(() -> {
            long soma = 0;
            for (int i = 0; i < 1_000_000; i++) {
               soma +=1;
            }
        });

    }

    public static long measureTime(Runnable task) {
        Long startTime = System.currentTimeMillis();
        task.run();
        Long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
