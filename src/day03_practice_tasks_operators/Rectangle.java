package day03_practice_tasks_operators;

public class Rectangle {
    public static void main(String[] args) {
        double length = 4.5;
        double width = 2;

        double areaOfRectangle = length*width;
        double perimeterOfRectangle= 2 * (length+width);

        System.out.println("perimeterOfRectangle = " + perimeterOfRectangle);
        System.out.println("areaOfRectangle = " + areaOfRectangle);
    }
}
