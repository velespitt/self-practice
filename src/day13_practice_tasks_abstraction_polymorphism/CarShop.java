package day13_practice_tasks_abstraction_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class CarShop {

    public static void main(String[] args) {
        Car[] cars = {
                new Honda(2010, "Pilot", 25000, "White"),
                new Audi(2014, "Q6", 32000, "Red"),
                new Honda(2011, "Accord", 20000, "White"),
                new Audi(2015, "Q4", 33000, "Blue"),
                new Audi(2019, "A7", 35000, "Black"),
                new Audi(2018, "Q8", 40000, "White"),
                new Audi(2009, "Q5", 30000, "Purple"),
                new Audi(2011, "A4", 30000, "Black"),
                new Honda(2018, "Civic", 30000, "Red"),
                new Honda(2012, "CR-V", 23000, "Red"),
                new Honda(2019, "HR-V", 35000, "Blue"),
                new Tesla(2015, "Model 3", 45000, "White"),
                new Tesla(2017, "Model Y", 65000, "Black"),
                new Tesla(2016, "Model X", 48000, "White"),
                new Tesla(2014, "Model X", 48000, "Blue")
        };

        for (Car car : cars) {
            if (car instanceof Honda && car.getYear() <= 2011 && car.getYear() >= 2010) {
                System.out.println(car);
            }
            if (car instanceof Audi && car.getYear() <= 2019 && car.getYear() >= 2015) {
                System.out.println(car);
            }
            if (car instanceof Tesla && car.getYear() <= 2016 && car.getYear() >= 2015) {
                System.out.println(car);
            }
        }

        Car highestPrice = cars[0];
        Car lowestPrice = cars[0];

        for (Car car : cars) {
            if (car.getPrice() > highestPrice.getPrice()) {
                highestPrice = car;
            } else if (car.getPrice() < lowestPrice.getPrice()) {
                lowestPrice = car;
            }
        }
        System.out.println("Highest priced car: " + highestPrice);
        System.out.println("Lowest priced car: " + lowestPrice);


        ArrayList<Tesla> teslaCars = new ArrayList<>();

        for (Car car : cars) {
            if (car instanceof Tesla) {
                teslaCars.add((Tesla) car);
            }

        }

        System.out.println("Tesla arabaları:");
        for (Tesla tesla : teslaCars) {
            System.out.println(tesla);
        }
    }
}


