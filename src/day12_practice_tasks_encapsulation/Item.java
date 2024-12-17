package day12_practice_tasks_encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        if (name == null) {
            System.out.println("Name cannot be null");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
//        tek if ile iceride atama yapmak icin butun kosullar dogrulanmali o yuzden ve kullaniyoruz.
//        // Geçerli koşulları kontrol et
//        if (name != null && !name.isBlank() && Character.isLetter(name.charAt(0)) &&
//                name.chars().allMatch(c -> Character.isLetterOrDigit(c) || Character.isSpaceChar(c))) {
//
//            // Eğer koşullar sağlanırsa, atama yapılır
//            this.name = name;
//        } else {
//            System.err.println("Invalid name. It must not be null/blank, must start with a letter, " +
//                    "and can only contain letters, digits, or spaces.");
//        }
//    }
        if (name == null || name.isBlank()) {
            System.err.println("Name cannot be null or blank.");
            return;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i)) && !Character.isSpaceChar(name.charAt(i))) {
                System.err.println("Name can only contain letters, digits, or spaces.");
                return;
            }
        }

        if (!Character.isLetter(name.charAt(0))) {
            System.err.println("Name must start with a letter.");
            return;
        }

        this.name = name;

//        tek if ile disarida atama yapmak
//        if (name != null || !name.isBlank() || Character.isLetter(name.charAt(0)) ||
//                name.chars().anyMatch(c -> Character.isLetterOrDigit(c) && Character.isSpaceChar(c))) {
//
//            System.err.println("Invalid name. It must not be null/blank, must start with a letter, " +
//                    "and can only contain letters, digits, or spaces.");
//            return;
//        }
//
//        this.name = name; // Şartları geçerse atama yapılır
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        }
    }

    public double calcCost() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost() +
                '}';
    }

    /*
    3. Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
     */
}
