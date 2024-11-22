package day07_practice_tasks_scanner_and_class;

public class RectangleClient {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.length = 150;
        rectangle.width = 200;

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println(rectangle);

    }

}
