package day08_practice_tasks_string_class;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)?");
        String split = scanner.next();

        System.out.println("Enter the number of people:");
        int numberOfPeople = scanner.nextInt();

        System.out.println("Enter the check amount:");
        double check = scanner.nextDouble();

        System.out.println("How was the service quality?");
        String service = scanner.next();

        scanner.close();

        double totalTip = 0;
        double perPerson = 0;
        double totalPay = 0;
        double tipPerPerson = 0;

        // Service quality kontrolü
        if (service.equals("Excellent")) {
            totalTip = check * 0.25;
        } else if (service.equals("Great")) {
            totalTip = check * 0.20;
        } else if (service.equals("Good")) {
            totalTip = check * 0.15;
        }
        else if (service.equals("Fair")) {
            totalTip = check * 0.10;
        }
        else if (service.equals("Poor")) {
            totalTip = check * 0.5;
        }

        // Total pay, tip hesaplandıktan sonra güncellenmeli
        totalPay = totalTip + check;

        if (split.equalsIgnoreCase("Yes")) {
            perPerson = totalPay / numberOfPeople;
            tipPerPerson = totalTip / numberOfPeople;


            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: " + totalPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + perPerson);
            System.out.println("Tip per person: " + tipPerPerson);
        } else {
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: " + totalPay);
            System.out.println("Total tip: " + totalTip);
        }

    }
}
