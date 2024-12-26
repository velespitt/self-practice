package day13_practice_tasks_abstraction_polymorphism;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(int year, String make, String model, double price, String color) {
        this.year = year > 1886 ? year : 0;
        this.make = make != null && !make.trim().isEmpty() ? make : "Invalid Type";
        this.model = model != null && !model.trim().isEmpty() ? model : "Invalid Type";
        setPrice(price);
        setColor(color);
    }

    public abstract void start();

    public abstract void drive();

    public void stop() {
        System.out.println("The " + make + " has stopped.");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price > 0 ? price : 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null || color.isEmpty() ? "Düzgün renk gir LAN" : color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
