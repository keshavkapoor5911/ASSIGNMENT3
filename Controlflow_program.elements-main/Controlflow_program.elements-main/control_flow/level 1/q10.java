
import java.util.Scanner;
public class q10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double num = sc.nextDouble();
    double total = 0.0;
    while (num != 0) {
      total += num;
      System.out.print("Enter a number: ");
      num = sc.nextDouble();
    }
    System.out.println("The sum of all numbers entered is " + total);
  }
}