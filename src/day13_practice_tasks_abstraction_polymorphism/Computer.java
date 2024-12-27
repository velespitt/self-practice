package day13_practice_tasks_abstraction_polymorphism;

public abstract class Computer extends Device {


    public Computer(String brand, String model, double price, String color, boolean hasPowerButton, boolean hasBattery) {
        super(brand, model, price, color, hasPowerButton, hasBattery);
    }

    public void computer() {
        System.out.println("Using computer" + getModel());
    }
}

class PersonalComputer extends Computer {


    public PersonalComputer(String brand, String model, double price, String color) {
        super(brand, model, price, color, true,true);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " turned off");

    }
}

class Desktop extends PersonalComputer{

    public Desktop(String brand, String model, double price, String color) {
        super(brand, model, price, color);
    }
}

class Laptop extends PersonalComputer{

    public Laptop(String brand, String model, double price, String color) {
        super(brand, model, price, color);
    }
}


