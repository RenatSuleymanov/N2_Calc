import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array):");
        int number;
        number = scanner.nextInt();
        if (number == 1){
            Calculator calculator = new Calculator();
            Calculator.launch();
        } else {
            MaxString maxString = new MaxString();
            MaxString.launch();
        }
    }
}