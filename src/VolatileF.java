import java.util.Scanner;

public class VolatileF {
    public static void main(String[] args) {
        MyThreadF myThread = new MyThreadF();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThreadF extends Thread {
    private volatile boolean running = true; // volatile помещает значение переменной сразу в оперативную память
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}