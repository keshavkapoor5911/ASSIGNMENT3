import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Leap Year");
        } else if (year < 1582) {
            System.out.println("Year is not in Gregorian calendar");
        } else {
            System.out.println("Not a Leap Year");}}}