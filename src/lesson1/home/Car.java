package lesson1.home;

public class Car {

    static String engine;
    static String motion;
    static int speed;


    public static String getEngine() {
        return engine;
    }

    public static void setEngine(String engine) {
        Car.engine = engine;
    }

    public static String getMotion() {
        return motion;
    }

    public static void setMotion(String motion) {
        Car.motion = motion;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Car.speed = speed;
    }

    public static String engineStart(){
        System.out.println("engine-wound");
        return engine;
    }
    public static String engineStop(){
        System.out.println("the engine died out");
        return engine;
    }

    public static String goForward(){
        System.out.println("the car rides ahead");
        return motion;
    }
    public static String goBackward(){
        System.out.println("the car rides backwards");
        return motion;
    }

    public static int speed(int s){
        System.out.println("Car speed = " + s + "km");
        return speed;
    }


}
