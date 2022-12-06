import java.util.concurrent.BlockingQueue;
import java.util.Random;

public class Producer implements Runnable {
    private static Random rand = new Random();
    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        int one;
        int two;
        try {
            while (true) {
                one = rand.nextInt(10000);
                two = rand.nextInt(10000);
                queue.put(new Task(one, two));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
