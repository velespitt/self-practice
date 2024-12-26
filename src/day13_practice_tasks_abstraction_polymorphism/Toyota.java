package day13_practice_tasks_abstraction_polymorphism;

public class Toyota extends Car{
    public Toyota(int year, String model, double price, String color) {
        super(year, "Toyota", model, price, color);
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
