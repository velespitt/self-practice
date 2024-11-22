package day05_practice_tasks_loop;

public class FactorialNumber {
    public static void main(String[] args) {
        /*
        Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
        int fac =1;
        int num=5;
        for (int i = 1; i<=num ; i++) {
            fac *=i;

        }
        System.out.println(fac);
    }
}
