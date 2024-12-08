package day10_practice_tasks_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {

    /*
    10. Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$',  '1', '2', '@', '!', '3', '4']
     */

    //removeall ve wrapperdaki isLetter kullanmaya calis


    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));


        System.out.println(list);

        list.removeIf(Character::isLetter);//shortcut method reference olarakta geciyormus
        System.out.println(list);

    }
}
