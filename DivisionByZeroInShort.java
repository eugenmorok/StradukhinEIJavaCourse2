import java.util.Scanner;

public class DivisionByZeroInShort {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //the greeting
        System.out.println("Hello, my little friend, the program divides two numbers\nin short(+32767...-32768) format " +
                "and displays the result on the screen!");

        System.out.print("please enter a divisible value: ");
        //declaring variables with the required values
        short dividend = in.nextShort();
        System.out.print("please enter a divisor value: ");
        //declaring variables with the required values
        short divisor = in.nextShort();
        System.out.print("congratulations, your answer is: ");
        //output of the result
        System.out.println(dividend / divisor);
        System.out.println("the end of the program");

    }

}
