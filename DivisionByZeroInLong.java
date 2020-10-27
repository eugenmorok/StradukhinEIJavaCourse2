import java.util.Scanner;

public class DivisionByZeroInLong {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //the greeting
        System.out.println("Hello, my little friend, the program divides two numbers\nin long(+9223372036854775807...-9223372036854775808) " +
                "format and displays the result on the screen!");

        System.out.print("please enter a divisible value: ");
        //declaring variables with the required values
        long dividend = in.nextLong();
        System.out.print("please enter a divisor value: ");
        //declaring variables with the required values
        long divisor = in.nextLong();
        System.out.print("congratulations, your answer is: ");
        //output of the result
        System.out.println(dividend / divisor);
        System.out.println("the end of the program");

    }

}
