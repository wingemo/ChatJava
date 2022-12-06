import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queue {

	public static void main(String[] args) {
		BlockingQueue queue = new ArrayBlockingQueue(10);

		(new Thread(new Producer(queue))).start();
		(new Thread(new Producer(queue))).start();
		(new Thread(new Producer(queue))).start();
		(new Thread(new Consumer(queue))).start();
		(new Thread(new Consumer(queue))).start();
		(new Thread(new Consumer(queue))).start();
        
	}

}
