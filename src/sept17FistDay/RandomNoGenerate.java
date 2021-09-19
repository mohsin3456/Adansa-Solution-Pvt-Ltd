
package sept17FistDay;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class RandomNoGenerate {
    public static void main(String[] args) {
       /* System.out.println(ThreadLocalRandom.current().nextInt());
        System.out.println(ThreadLocalRandom.current().nextDouble());
        System.out.println(ThreadLocalRandom.current().nextFloat());
        System.out.println(ThreadLocalRandom.current().nextBoolean());
        */
       
       Random random=new Random();
        random.nextLong();
        System.out.println(random.nextLong());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextInt());
    }
    
}
