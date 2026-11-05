import java.util.Random;

public class exercicio32 {
    public static int getRandomNumber(int max){
        return new Random().nextInt(max) + 1;
    }

    public static void main(String[] args) {
        int number = getRandomNumber(100);
        System.out.println("Numero sorteado: " + number);
    }
}
