package day13_practice_tasks_abstraction_polymorphism;

public class BMW extends Car{
    public BMW(int year, String make, String model, double price, String color) {
        super(year, "BMW", model, price, color);
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
