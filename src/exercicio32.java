import java.util.Random;

public class exercicio32 {
    public static int getRandomNumber(int max){
        return new Random().nextInt(max) + 1;
    }
}
