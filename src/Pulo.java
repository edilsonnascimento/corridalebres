import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Pulo {
    public static int aleatorio(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Erro");
        }
        Random rnd = ThreadLocalRandom.current();
        return rnd.nextInt(3) + 1;
    }
}
