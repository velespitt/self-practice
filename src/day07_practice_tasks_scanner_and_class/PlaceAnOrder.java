package day07_practice_tasks_scanner_and_class;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        /*

10. Create a class named PlaceAnOrder:

    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Product name: ");

        String productName = input.nextLine();

        System.out.println("Price: ");

        double price = input.nextDouble();

        System.out.println("Quantity :");

        int quantity = input.nextInt();

        System.out.println("First name: ");

        String firstName = input.next();

        input.close();

        double total = price * quantity;

        System.out.println(firstName + ", your order for " + quantity + " " + productName + "s" + " has been placed. Your total is " + total);
    }
}
