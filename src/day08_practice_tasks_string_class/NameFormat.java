package day08_practice_tasks_string_class;

import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        /*

6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("firstName = ");

        String firstName = scanner.next();

        System.out.println("lastName = ");

        String lastName = scanner.next();

        scanner.close();

        StringBuilder kucukHarf = new StringBuilder(firstName.toLowerCase());

        StringBuilder ilkHarfBuyutme = new StringBuilder(kucukHarf.substring(0,1).toUpperCase()).append(kucukHarf.substring(1));

        StringBuilder lastNameLower = new StringBuilder(lastName.toLowerCase());

        StringBuilder lastNameCapitalized = new StringBuilder(lastNameLower.substring(0, 1).toUpperCase()).append(lastNameLower.substring(1));

        System.out.println(ilkHarfBuyutme);

        System.out.println(lastNameCapitalized);



    }
}
