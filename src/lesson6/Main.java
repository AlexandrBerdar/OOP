package lesson6;

public class Main {

    public static class Counter extends Thread{
        @Override
        public void run() {
            int x = 1;
            while (!isInterrupted()){
                System.out.println("tick " + x++);
                yield();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int y =1;
        counter.start();
        counter.setPriority(1);
        Thread.sleep(5000);
        System.out.println("tick " + y++);
        counter.interrupt();
    }
}
