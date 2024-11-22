package day07_practice_tasks_scanner_and_class;

import java.util.Scanner;

public class CentToDollar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Cent: ");
        // Cent değeri
        int cent = input.nextInt(); // Örneğin 250 cent

        int dollar = cent / 100;
        int kurus = cent % 100;

        input.close();

        System.out.println(cent + " cent = " + dollar + " dollars and " + kurus + " cents");
    }
}
