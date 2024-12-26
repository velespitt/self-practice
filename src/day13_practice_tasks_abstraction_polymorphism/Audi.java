package day13_practice_tasks_abstraction_polymorphism;

public class Audi extends Car implements AutoPark {
    public Audi(int year, String model, double price, String color) {
        super(year, "Audi", model, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto parking " + getModel());
    }

    @Override
    public void start() {
        System.out.println("Power on for " + getMake());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getModel());
    }
}
