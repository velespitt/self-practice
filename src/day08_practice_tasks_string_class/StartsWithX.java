package day08_practice_tasks_string_class;

public class StartsWithX {
    public static void main(String[] args) {

        /*
        1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
         */
        String str = "XCODEX";
        String newStr = str.toLowerCase().replaceFirst("x","a");

        System.out.println(newStr);

        //Can be done with charAt(0) and substring
    }
}
