
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Enter a natural number.");
            sc.close();
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
            } else {
                System.out.println(i + " is odd number");
            }
            System.out.println("Current number is: " + i);
        }
    }
}
