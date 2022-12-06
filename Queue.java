import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queue {
       BlockingQueue queue;

       public Main(int year, String name) {
              queue = new ArrayBlockingQueue(10);
        }

        static void myMethod() {
              new Thread(new Producer(queue))).start();
              (new Thread(new Producer(queue))).start();
	      (new Thread(new Producer(queue))).start();
	      (new Thread(new Consumer(queue))).start();
	      (new Thread(new Consumer(queue))).start();
	      (new Thread(new Consumer(queue))).start();        
	}
}
