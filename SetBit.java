import java.util.Scanner;

public class SetBit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int template = 1;
        System.out.println("Good day, The program sets a specific int-bit that the user specifies (from 0 to 31)  to \"one\".");
        System.out.print("Please enter your number: ");
        int income_number = scan.nextInt();
        System.out.print("Please enter your bit-index: ");
        int income_index = scan.nextInt();
        if (income_index >= 0 & income_index < 32) {
            int new_template = template << income_index;
            int print_number = income_number | new_template;
            System.out.println(print_number);
        } else System.out.println("Your bit-index is incorrect");
        System.out.println("The end of the program");


    }
}