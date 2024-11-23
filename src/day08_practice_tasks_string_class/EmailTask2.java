package day08_practice_tasks_string_class;

public class EmailTask2 {
    public static void main(String[] args) {
        /*
        5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
         */

        String email = "craig_federighi@apple.com";

        int underScore = email.indexOf('_');

        int at = email.indexOf('@');

        int dat = email.indexOf('.');


        String firstName = email.substring(0, underScore);
        String lastName = email.substring(underScore + 1, at);
        String domain = email.substring(at + 1, dat);

        String firstLetter = email.substring(0,1).toUpperCase();

        String lastLetter = lastName.substring(0,1).toUpperCase();

        System.out.println("First name: " + firstLetter + firstName.substring(1));
        System.out.println("Last name: " + lastLetter + lastName.substring(1));
        System.out.println("Domain: " + domain);
    }
}
