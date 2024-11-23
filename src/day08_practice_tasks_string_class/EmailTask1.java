package day08_practice_tasks_string_class;

public class EmailTask1 {
    public static void main(String[] args) {
        /*
        4. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
         */

        String text = "mike_tyson@gmail.com";

        String result = text.replaceAll("mike_tyson", "tyson_mike");

        if (text.contains("_")) {

            System.out.println(result);

        } else System.out.println(text);

        //Another solution without using contains is using firstName lastName and @ as separate variable then change them with substring.

    }
}
