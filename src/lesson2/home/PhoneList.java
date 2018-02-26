package lesson2.home;

public class PhoneList {
    private Phone[] list = new Phone [10];
    private int phoneCoun;

    public void add(Phone phone) {
        if (phoneCoun == list.length) {
            Phone[] list = new Phone[this.list.length * 3 / 2 + 1];
            System.arraycopy(this.list, 0, list, 0, this.list.length);
            this.list = list;
        }
        list[phoneCoun++] = phone;
    }

    public void delete(int n) {
        if (n >= 0 && n < list.length) {
            for (int i = n; i < list.length - 1; i++)
                list[i] = list[i+1];
            list[list.length - 1] = null;
            phoneCoun--;
        }
    }

    public Phone get(int n) {
        return list[n];
    }

    public int getPhoneCounter () {
        return phoneCoun;
    }

    public Phone findPhone (String number) {
        for(int i = 0; i < phoneCoun; i++ )
            if(list[i].getPhoneNumber().equals(number))
                return list[i];
        return null;
    }

    public void showAllList(){
        System.out.println("-----------------------------------------");
        System.out.println("Phone book:");
        for(int i = 0; i < phoneCoun; i++)
            System.out.println((i+1) + ") " + list[i].getModel() + ":\t" + list[i].getPhoneNumber() + " - " + list[i].getCallCounter() +" phone cals, " + list[i].getSmsCounter() +" sms");
        System.out.println("-----------------------------------------");
    }
}
