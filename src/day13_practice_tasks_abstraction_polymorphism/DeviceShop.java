package day13_practice_tasks_abstraction_polymorphism;

public class DeviceShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("X",999.99,"Gold");
        System.out.println(iphone);
        iphone.turnOn();
        iphone.turnOff();
        iphone.downloadApp();
        iphone.call(5332304296L);
        iphone.text(5332304296L);

        System.out.println("----------------------------");

        Google google = new Google("10V",2000,"White");
        System.out.println(google);
        google.turnOn();
        google.turnOff();
        google.downloadApp();
        google.call(5332304296L);
        google.text(5332304296L);

        System.out.println("----------------------------");

        Samsung samsung = new Samsung("S20",1050,"BLack");
        System.out.println(samsung);
        samsung.turnOn();
        samsung.turnOff();
        samsung.downloadApp();
        samsung.call(5332304296L);
        samsung.text(5332304296L);

        System.out.println("----------------------------");

        Desktop desktop = new Desktop("HP","230 Series",1300,"Grey");
        System.out.println(desktop);
        desktop.turnOn();
        desktop.turnOff();

        System.out.println("----------------------------");

        Laptop laptop = new Laptop("Windows","Surface",500,"Green");
        System.out.println(laptop);
        laptop.turnOn();
        laptop.turnOff();
    }
}
