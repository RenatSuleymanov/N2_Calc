import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void launch() {
        double firstNumber = getNumber();
        double secondNumber = getNumber();
        char operation = getOperation();
        double result = calc(firstNumber, secondNumber, operation);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static double getNumber() {
        System.out.println("Enter the number:");
        double number;
        number = scanner.nextDouble();
        return number;
    }

    public static char getOperation() {
        System.out.println("Enter operation:");
        char operation;
        operation = scanner.next().charAt(0);
        return operation;
    }

    public static double calc(double firstNumber, double secondNumber, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber==0) {
                    System.out.println("Error");
                    result = 0;
                    break;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Unknown operation. Reenter operation");
                result = calc(firstNumber, secondNumber, getOperation());
        }
        return result;
    }
}