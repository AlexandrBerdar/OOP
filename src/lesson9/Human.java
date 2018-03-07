package lesson9;

import java.util.Date;

public class Human implements Cloneable {

    public   String firstName;
    public   String lastName;
    public  int age;
    public Date date = new Date();

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    @Override
    public Object clone() throws CloneNotSupportedException{
        Human human = (Human)super.clone();
        human.date = (Date) date.clone();

        return human;

    }

    public static void main(String[] args) {
        Human a1 = new Human("Alex", "Zed",15);
    }
}

