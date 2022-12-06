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
            Runnable producer = new Producer(prop, bank, queue);  
            pool.execute(producer)
            Runnable consumer = new Consumer(prop, bank, queue);  
            pool.execute(consumer); 
          }        
	}

        static void shutdown() {  
          executor.shutdown();       
	}
}
