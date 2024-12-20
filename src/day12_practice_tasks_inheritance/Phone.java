package day12_practice_tasks_inheritance;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        this.size = size;
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        if (brand == null || brand.isBlank()) {
            System.err.println("Brand cannot be null/empty.");
        }
        return brand;

    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            System.err.println("Brand cannot be null/empty.");
        } else this.brand = brand;

    }

    public String getModel() {
        if (model == null || model.isBlank()) {
            System.err.println("Model cannot be null/empty.");
        }
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank() || model.isEmpty()) {
            System.err.println("Model cannot be null/empty.");
        } else this.model = model;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    public String getColor() {
        if (color == null || color.trim().isBlank()) {
            System.err.println("Color cannot be null/empty.");
        }
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isBlank()) {
            return;
        }
        this.color = color;
    }

    public void call(long phoneNumber) {
        System.out.println("Calling the number " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Texting to the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
