package day07_practice_tasks_scanner_and_class;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        /*

11. Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt();

        System.out.println("Enter your gender: ");

        String gender = input.next();
        input.nextLine();

        System.out.println("Enter your full name: ");

        String fullName = input.nextLine();

        System.out.println("Enter your phone number: ");

        long phoneNum = input.nextLong();

        System.out.println("Enter your zip code: ");

        int zip = input.nextInt();

        System.out.println("School Name: ");

        String schoolName = input.nextLine();
        input.nextLine();
        System.out.println("City Name: ");

        String cityName = input.nextLine();

        System.out.println("State Name: ");

        String stateName = input.next();

        input.nextLine();

        System.out.println("Building num: ");

        int building = input.nextInt();

        System.out.println("Street name: ");

        String street = input.nextLine();

        input.nextLine();
        input.close();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phoneNum);
        System.out.println("School name: " + schoolName);
        System.out.println("Address: ");
        System.out.println("\t\t" + building + " " + street);
        System.out.println("\t\t" + cityName + ", " + stateName + " " + zip);

    }
}
