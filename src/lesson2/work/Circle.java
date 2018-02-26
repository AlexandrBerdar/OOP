package lesson2.work;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare(){
        return Math.PI * radius * radius;
    }
}
