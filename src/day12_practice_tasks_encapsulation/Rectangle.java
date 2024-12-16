package day12_practice_tasks_encapsulation;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width, length);
    }

    public void setWidth(double width, double length) {
        if (width > 0 && length > 0) {
            this.width = width;
            this.length = length;
        }
    }

    public double calcArea() {
        return width * length;
    }

    public double calcPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "width=" + width +
                " length=" + length +
                " calcArea=" + calcArea() +
                " calcPerimeter=" + calcPerimeter() +
                '}';
    }
	/*
	2. Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
	 */
}
