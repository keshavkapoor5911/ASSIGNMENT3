
import java.util.Scanner;
public class q8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number for countdown: ");
    int counter = sc.nextInt();

    while (counter >= 1) {
      System.out.println("Countdown: " + counter);
      counter--;
    }
    
  }
}