package lesson2.work;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,3);
        System.out.println("rectangle = " + rectangle.getSquare());

        Square square = new Square(3);
        System.out.println("square = " + square.getSquare());
    }
}
