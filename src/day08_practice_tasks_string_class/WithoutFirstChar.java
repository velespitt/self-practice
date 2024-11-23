package day08_practice_tasks_string_class;

public class WithoutFirstChar {
    public static void main(String[] args) {
        /*

2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
         */

        String input1 = "apple";
        String input2 = "banana";

        String deneme = input1.substring(0,1);
        String deneme2 = input2.substring(0,1);

        String newInput1 = input1.replaceFirst(deneme, "");
        String newInput2 = input2.replaceFirst(deneme2, "");

        System.out.println(newInput1 + newInput2);

        //Veya replace etmek yerine index 1den başlatıp ilk karakteri hiç yazmayız. System.out.println(input1.substring(1) + input2.substring(1);
        System.out.println(input1.substring(1) + input2.substring(1));
    }
}
