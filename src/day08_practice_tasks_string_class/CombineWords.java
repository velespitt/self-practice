package day08_practice_tasks_string_class;

public class CombineWords {
    public static void main(String[] args) {
        /*
        3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
         */

        String text1 = "one";
        String text2 = "eight";
        String last="";

        if (text1.endsWith("e") && text2.startsWith("e")) {

            last = text1 + text2.replace("e","");
        }
        System.out.println(last);

        //It can be done with boolean instead if "" and using substring
    }
}
