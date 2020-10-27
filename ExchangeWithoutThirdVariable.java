import java.util.Scanner;

public class ExchangeWithoutThirdVariable {

    public static void main(String[] args) {
        //your variables
        int first_variable = 0;
        int second_variable = 0;
        //int amount_variable = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Hello, I\'m the program and I want to take two numbers and swap them in the new way!");
        System.out.print("Please, enter your first number: ");
        first_variable = in.nextInt();
        System.out.print("Please, enter your second number: ");
        second_variable = in.nextInt();

        first_variable = first_variable + second_variable;
        second_variable = first_variable - second_variable;
        first_variable = first_variable -second_variable;

        System.out.println("the first variable is " + (first_variable) + " now, and the second" +
                " variable is " + (second_variable) + " now");
        System.out.println("the end of the program");


    }
}
