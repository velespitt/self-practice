package extra_practice;

import java.util.Arrays;

public class TestEnum {
    public static void main(String[] args) {
        Enum day = Enum.FRIDAY;

        switch (day) {
            case FRIDAY -> System.out.println("Yeey!");
        }

        Enum[] weekDays = Enum.values();
        System.out.println(Arrays.toString(weekDays));
    }
}
