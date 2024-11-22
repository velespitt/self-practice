package day07_practice_tasks_scanner_and_class;

import java.util.Scanner;

public class Circle {
    /*

6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");

        int radius = input.nextInt();

        double areaOfCircle = 3.14 * radius * radius;
        float perimeter = (float) (2 * 3.14 * radius);

        System.out.println("The area of the Circle is " + areaOfCircle);
        System.out.println("The perimeter of the Circle is " + perimeter);
    }
}
