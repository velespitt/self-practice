package day10_practice_tasks_arraylist;

import java.util.ArrayList;

public class MultiplyOddNumbers {
    /*
    6. Create a class called MultiplyOddNumbers and write a program with the following specifications:
   6.1 Given an ArrayList, multiply each odd number by 2.

				Example:
					list = [1,2,3,4,5];

				output:
					[2,2,6,4,10]
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(4);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer eachNum : numbers) {

            if (eachNum % 2 != 0) {
                eachNum *= 2;
            }

            System.out.print(eachNum + " ");
        }

        System.out.println();

        //Icime sinen hali

        ArrayList<Integer> number1 = new ArrayList<Integer>(4);

        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(5);

        // İndeks tabanlı döngü
        for (int i = 0; i < number1.size(); i++) {
            if (number1.get(i) % 2 != 0) {//Listenin kendisine matematiksel islem uygulanamaz o yuzden get(i) kullaniyoruz hep.
                number1.set(i, number1.get(i) * 2); // Güncelleme işlemi ve setin dogasi geregi , kullandik.
            }
        }

        // Güncellenmiş listeyi yazdır
        for (Integer num : number1) {
            System.out.print(num + " ");
        }
    }
}