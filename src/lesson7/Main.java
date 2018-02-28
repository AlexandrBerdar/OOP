package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[10000];
        Arrays.fill(array, 5);
        for (int i = 1; i < 10; i++) {
            double time = calculate(i,array);
            System.out.println(i + ": " + time);


        }
    }
        static double calculate(int threads, int[] array) throws InterruptedException{
            long time = System.currentTimeMillis();
            Counter[] counters = new Counter[threads];
            double attempts = 1000;
            for (int attempt = 0; attempt < attempts; attempt++) {
                for (int i = 0; i < threads; i++) {
                    counters[i] = new Counter(array, i * 100, (i + 1) * 100);
                    counters[i].start();

                }
                for (Counter counter : counters) {
                    counter.join();
                }
                long result = 0;
                for (Counter counter : counters) {
                    result += counter.getResult();
                }
            }
            time = System.currentTimeMillis() - time;
            return time / attempts;

        }




    static class Counter extends Thread {
    private int[] array;
    private int start, stop;
    private long result;

    public Counter(int[] array, int start, int stop) {
        this.array = array;
        this.start = start;
        this.stop = stop;
    }
    public void run(){
        for (int i = start; i < stop; i++) {
            result += array[i];

        }
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }
}


}

