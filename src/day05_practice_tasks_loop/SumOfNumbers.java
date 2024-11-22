package day05_practice_tasks_loop;

public class SumOfNumbers {
    public static void main(String[] args) {
        /*
        4. Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050


				Example 2:
					    number = 50

				Output:
					  1275

         */
int sum=0;
int num=100;
        for (int i = 1; i<=num ; i++) {
            sum+=i;

        }
        System.out.println(sum);


    }
}
