package day14_practice_tasks_collections_maps;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(15);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(15);
        numbers.add(0);

        Collections.sort(numbers);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            if (Collections.frequency(uniqueNumbers, num) == 0)//==0 means frequency is 0 so it is not duplicated.
            {
                uniqueNumbers.add(num);
            }
        }

        System.out.println("uniqueNumbers = " + uniqueNumbers);

    }
}
