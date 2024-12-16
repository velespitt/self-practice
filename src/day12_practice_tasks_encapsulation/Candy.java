package day12_practice_tasks_encapsulation;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }

    public String getBrand(){
        return brand;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + (price == 0 ? " Free" : price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
    /*
    4. Create a custom class named Candy with the following specifications:

	Attributes:
		brand
		quantity
		price
		hasPeanuts

	Ensure encapsulation for all fields.
		Conditions:
			The price of candy cannot be set to a negative value.
			The quantity of candy cannot be set to zero or a negative value.

	Add a constructor that allows the user to set all fields during object creation.

	Actions:
		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.

	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.
     */
}
