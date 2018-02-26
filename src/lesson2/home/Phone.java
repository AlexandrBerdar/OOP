package lesson2.home;

public abstract class Phone {
    private static PhoneList list = new PhoneList();

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected int callCounter;
    protected int smsCounter;
    protected String phoneNumber;
    protected String model;

    public static void addPhone(Phone phone) {
        list.add(phone);
    }

    public static void showList() {
        list.showAllList();
    }

    public void call(String number) {
        System.out.println(model + " is calling to " + number);
        callCounter++;
        answer(number);
    }

    private void answer(String number) {
        try{
            Phone phone = list.findPhone(number);
            System.out.println(phone.getModel() + " is answer." );
        } catch (Exception e) {
            System.out.println(number + " is answer." );
        }
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getCallCounter() {
        return callCounter;
    }

    public int getSmsCounter() {
        return smsCounter;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setPhoneNumber(String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void sendSMS(String number, String message);
}
