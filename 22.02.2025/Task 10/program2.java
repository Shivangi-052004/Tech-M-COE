class SharedResource {
    int data;
    boolean isProduced = false;

    // Method for producer to produce data
    synchronized void produce(int value) {
        while (isProduced) {
            try {
                wait(); // Wait if data is already produced
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = value;
        isProduced = true;
        System.out.println("Produced: " + data);
        notify(); // Notify the consumer thread
    }

    // Method for consumer to consume data
    synchronized void consume() {
        while (!isProduced) {
            try {
                wait(); // Wait if no data is produced yet
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
        notify(); // Notify the producer thread
    }
}

// Producer Thread
class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        int i = 0;
        while (true) {
            resource.produce(++i);
            try {
                Thread.sleep(1000); // Simulate time delay for producing
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            resource.consume();
            try {
                Thread.sleep(2000); // Simulate time delay for consuming
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main Class to Test Inter-thread Communication
public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}
