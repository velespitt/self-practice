package day13_practice_tasks_abstraction_polymorphism;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(int year, String model, double price, String color) {
        super(year, "Mercedes", model, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto parking " + getModel());
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
