package day10_practice_tasks_arraylist;

public class UpperCaseAndLowerCase {
    /*
    2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
       2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

                Eamplex:
                    str = "JAVA java";

                output:
                    true
     */
    public static void main(String[] args) {
        String str = "JAVA jaava";

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
        }

        if (upperCaseCount == lowerCaseCount) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        }

    }

