import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);
        System.out.println("The area of triangle is " + areaCm + " square cm and " + areaInches + " square inches");
    }
}