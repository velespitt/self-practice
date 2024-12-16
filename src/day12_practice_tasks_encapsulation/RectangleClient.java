package day12_practice_tasks_encapsulation;

public class RectangleClient {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(14, 10);
        System.out.println(rectangle);//constructor and toStr working

        rectangle.setWidth(15, 20);
        System.out.println(rectangle);

        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());

        Rectangle rectangle1 = new Rectangle(-10, 1);
        System.out.println(rectangle1);

    }
}
