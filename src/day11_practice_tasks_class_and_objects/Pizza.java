package day11_practice_tasks_class_and_objects;

public class Pizza {
    /*
    1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
     */

    public String size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public int calcCost() {
        int cost = 0;
        if (size.equals("Small")) {
            cost = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }
        if (size.equals("Medium")) {
            cost = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }
        if (size.equals("Large")) {
            cost = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }
        return cost;

    }

    @Override
    public String toString() {
        return "Your " + size + " pizza with " + numberOfCheeseTopping + " cheese toppings and " + numberOfPepperoniTopping + " pepperoni toppings " +
                " pepperoni toppings costs a total of $" + calcCost();

    }
}
