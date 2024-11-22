package day07_practice_tasks_scanner_and_class;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        /*
        7. Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");

        int score = input.nextInt();

        if (score >= 0 && score <= 100) {//If the score is valid

            if (score >= 90) {
                System.out.println("Your grade is A");
            } else if (score >= 60) {
                System.out.println("Your grade is B");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Invalid score");

        }

    }
}
