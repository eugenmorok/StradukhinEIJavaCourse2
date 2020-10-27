import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f_number = 0;
        int s_number = 0;
        System.out.println("Good day!\n" + "This program performs a few\nsimple operations with two numbers" +
                "\nand displays the results on the screen");
        System.out.print("Please enter your your first number \"a\" right here >>> ");
        f_number = scan.nextInt();
        System.out.print("OK, now enter your second number \"b\" right here >>> ");
        s_number = scan.nextInt();
        System.out.println("Thank you, and all of your answers are on the bottom:");
        System.out.println("a + b = " + (f_number + s_number) + "\n" +
                "a * b = " + (f_number * s_number) + "\n" +
                "a - b = " + (f_number - s_number) + "\n" +
                "quotient of division a and b = " + (f_number / s_number) + "\n" +
                "remainder of division a and b = " + (f_number % s_number) + "\n"

        );


    }
}
