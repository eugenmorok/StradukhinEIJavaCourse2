import java.util.Scanner;

public class BaseParsingTwoDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //some coment here
        System.out.println("My greeting to you, this program takes a number and parses it. So, let's do it!");
        System.out.print("Please enter some two-digit number to the field >>> ");
        int input_number = 0;
        input_number = scan.nextInt();
        //and here
        int units = input_number % 10;
        int tens = (input_number - units) / 10;
        System.out.println("Welldone!");
        //and maybe here :)
        System.out.println("The number has " + tens + " tens, and " + units + " units");
        System.out.println("The end of the program");


    }

}
