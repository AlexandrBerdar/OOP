package lesson2.home;

public class IphoneX extends Phone {

    public IphoneX(){
        System.out.println("SamsungS4 constructor");

        touch = true;
        hasWifi = true;
        screenSize = 6;
        phoneNumber = "0978409220";
    }

    @Override
    public void sendSMS(String number, String message) {

    }
}
