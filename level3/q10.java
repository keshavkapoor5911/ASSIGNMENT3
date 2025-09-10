
import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();
        System.out.print("Enter a number for loop: ");
        int number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            switch (op) {
                case "+" ->
                    System.out.println("Result: " + (first + second));
                case "-" ->
                    System.out.println("Result: " + (first - second));
                case "*" ->
                    System.out.println("Result: " + (first * second));
                case "/" -> {
                    if (second == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + (first / second));
                    }
                }
                default ->
                    System.out.println("Invalid Operator");
            }
        }
    }
}
