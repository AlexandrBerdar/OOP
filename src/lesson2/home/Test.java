package lesson2.home;

public class Test {

    public static void main(String[] args) {
        SamsungS4 samsungS4 = new SamsungS4();
        Phone.addPhone(samsungS4);

        samsungS4.call("0978409220");
        samsungS4.sendSMS("0978409220", "Hello!");
    }
}
