package day09_practice_tasks_arrays;

public class GroceryItems {
    /*
    10. Create a class named GroceryItems and write a program with the following specifications:
    10.1 Given the following array:
         String[][] items = {
             {"Apple", "Banana", "Grape", "Avocado"},
             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
         };

    10.2 Print the following output: (add \t between two words)
         Apple    Banana   Grape    Avocado
         Paper Towels     Toilet Papers   Tissues    Diapers
         Coke   Fanta   Arizona Tea   Pepsi   Water

         for (int i = 0; i < items.length; i++) {
            //inner loop
            for (int j = 0 ; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");
            }

    10.3 Print the following output: (add \t between two words)
         Avocado   Grape    Banana    Apple
         Diapers   Tissues   Toilet Papers   Paper Towels
         Water    Pepsi    Arizona Tea    Fanta   Coke

         for (int outer = 0; outer < items.length; outer++) {
                for (int inner = items[outer].length - 1; inner >= 0; inner--) {
                    System.out.print(items[outer][inner] + "\t");
                }

    10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado

         for (int outer = items.length - 1; outer >= 0; outer--) {
            for (int inner = 0; inner < items.length; inner++) {
                System.out.print(items[outer][inner] + "\t");
            }

     */


    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


    }


}



