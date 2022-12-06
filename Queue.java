import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queue {
       BlockingQueue queue;
       ExecutorService pool;
       Bank bank;

       public Queue(int year, String name) {
           queue = new ArrayBlockingQueue(10);
           pool = Executors.newFixedThreadPool(5);
        }

        static void execute() {
          for (int i = 0; i < 5; i++) {  
            pool.submit(new Producer(prop, bank, queue));
            pool.submit(new Consume(prop, bank, queue));
          }        
	}

        static void shutdown() {  
          pool.shutdown();       
	}
}
