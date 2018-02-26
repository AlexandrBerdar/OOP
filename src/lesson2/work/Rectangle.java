package lesson2.work;

public class Rectangle extends Figure{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public double getSquare() {
        return width * height;
    }
}
