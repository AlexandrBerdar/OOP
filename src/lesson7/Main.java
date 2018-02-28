package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[1000];
        Arrays.fill(array,5);
        Counter[] counters = new Counter[10];
        for (int i = 0; i < 10 ; i++) {
            counters[i] = new Counter(array,i*100,(i+1)*100);
            counters[i].start();

        }
        for (Counter counter : counters){
            counter.join();
        }
        long result = 0;
        for (Counter counter : counters){
            result += counter.getResult();
        }
        System.out.println(result);
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

