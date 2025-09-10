
import java.util.Scanner;

public class q11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int sum = 0;
    while (true) {
      if (num == 0 || num < 0) {
        break;
      }
      sum += num;
      System.out.print("Enter a number: ");
      num = sc.nextInt();
    }
    System.out.println("The sum of all numbers entered is " + sum);
  }
}