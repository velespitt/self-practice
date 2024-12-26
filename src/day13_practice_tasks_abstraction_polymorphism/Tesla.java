package day13_practice_tasks_abstraction_polymorphism;

public class Tesla extends Car implements  AutoPark, AutoPilot{
    public Tesla(int year, String model, double price, String color) {
        super(year, "Tesla", model, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println("Self driving " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println("Auto parking " + getModel());;
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
