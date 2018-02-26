package lesson1;

public class Circle {

    private  double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public double rd(double d){
        return Math.PI * r *r ;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }



}
