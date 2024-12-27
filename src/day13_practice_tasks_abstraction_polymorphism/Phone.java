package day13_practice_tasks_abstraction_polymorphism;

public abstract class Phone extends Device {


    public Phone(String brand, String model, double price, String color, boolean hasPowerButton, boolean hasBattery) {
        super(brand, model, price, color, hasPowerButton, hasBattery);
    }

    public void call(long phoneNum) {
        System.out.println("Calling: " + phoneNum);
    }

    public void text(long phoneNum) {
        System.out.println("Texting: " + phoneNum);
    }

}

class Iphone extends Phone implements Downloadable, AppleApps {

    public Iphone(String model, double price, String color) {
        super("Iphone", model, price, color,true,true);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " Turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " Turned off");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps to " + getBrand() + " from " + APP_STORE_NAME);
    }
}

class Samsung extends Phone implements Downloadable, AndroidApps {

    public Samsung(String model, double price, String color) {
        super("Samsung", model, price, color, true, true);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " Turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " Turned off");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps to " + getBrand() + " from " + APP_STORE_NAME);
    }
}

class Google extends Phone implements Downloadable, AndroidApps {

    public Google(String model, double price, String color) {
        super("Google", model, price, color,true,true);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " Turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " Turned off");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps to " + getBrand() + " from " + APP_STORE_NAME);
    }
}
