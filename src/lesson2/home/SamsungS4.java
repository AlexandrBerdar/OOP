package lesson2.home;

public class SamsungS4 extends Phone {

    public SamsungS4(){
        System.out.println("SamsungS4 constructor");

        touch = true;
        hasWifi = true;
        screenSize = 5;
        phoneNumber = "0678842584";
    }

    @Override
    public void call(String number) {
        super.call(number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("SamsungS4 class is sending sms " + message + " to " + number);

    }
}
