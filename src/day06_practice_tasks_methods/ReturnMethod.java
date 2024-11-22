package day06_practice_tasks_methods;

public class ReturnMethod {
    public static void main(String[] args) {
        double result = calculate(301, '1', 5);
        System.out.println(result == 0 ? "Invalid Operator": result);
    }

    public static double calculate(double num1, char mathOperator, double num2) {

        switch (mathOperator) {
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2;
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                return num1 / num2;
            }
            case '%' -> {
                return num1 % num2;
            }
            default -> {
                return 0;
            }
        }
    }
}
