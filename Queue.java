import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queue {
       BlockingQueue queue;
       ExecutorService executor;

       public Main(int year, String name) {
              queue = new ArrayBlockingQueue(10);
              executor = Executors.newFixedThreadPool(5);
        }

        static void execute() {
          for (int i = 0; i < 5; i++) {  
            Runnable worker = new WorkerThread(prop, queue);  
            executor.execute(worker); 
            Runnable consumer = new WorkerThread(prop, queue);  
            executor.execute(consumer); 
          }        
	}

        static void shutdown() {  
          executor.shutdown();       
	}
}
