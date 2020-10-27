import java.util.Scanner;

public class ExchangeRightShift {
    public static void main(String[] args) {
        //your variables
        int first_variable = 0;
        int second_variable = 0;
        int third_variable = 0;
        int amount_variable = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Hello, I\'m the program and I want to take three numbers and swap them in circle" +
                "method to the right!");
        System.out.print("Please, enter your first number: ");
        first_variable = in.nextInt();
        System.out.print("Please, enter your second number: ");
        second_variable = in.nextInt();
        System.out.print("Please, enter your third number: ");
        third_variable = in.nextInt();

        amount_variable = first_variable + second_variable + third_variable;
        System.out.print("\nyou entered these values now: "
                + (first_variable) + ","
                + (second_variable) + ","
                + (third_variable));

        System.out.println("\nyour new result is: " +
                (amount_variable - first_variable - third_variable) + "," +
                (amount_variable - first_variable - second_variable) + "," +
                (amount_variable - third_variable - second_variable));
        System.out.println("the end of the program");


    }

}
