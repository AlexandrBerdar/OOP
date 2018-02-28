package lesson7;



public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Container container = new Container();
        for (int i = 0; i < 1000; i++) {
            new Incrementor(container).start();

        }
        Thread.sleep(500);
    }
}

class Container {
    int counter;
}

class Incrementor extends Thread{
    Container container;

    public Incrementor(Container container) {
        this.container = container;
        setDaemon(true);
    }

    public void run() {
        while (true){
            System.out.println(++container.counter);
        }
    }
}
