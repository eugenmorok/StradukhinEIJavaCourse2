import java.util.Scanner;

public class DivisionByBit {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, the program Divisions the number entered by the user by the power of two, which is also requested from the user.");
        System.out.print("Enter the number: ");
        int value = scan.nextInt();
        System.out.print("Enter the degree: ");
        int degree = scan.nextInt();
        System.out.println(value >> degree);
        System.out.println("The end of the program");
    }

}
