package lesson1.home;

public class ClassSum {

    static int number;

    ClassSum(){
        number++;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new ClassSum();

        }
        System.out.println(ClassSum.number);
    }
}
