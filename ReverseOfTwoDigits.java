import java.util.Scanner;

public class ReverseOfTwoDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int new_number = 0;
        System.out.println("Hi, this program takes a two-digit number and reverse the digits of that number!");
        System.out.print("And now, please tell me what a number (10...99) do you give me >>> ");
        new_number = scan.nextInt();
        int f_pos = new_number % 10 * 10;
        int s_pos = new_number / 10;

        System.out.printf("Our new number is %d, goodbye!", s_pos + f_pos);
        System.out.println("\nThe end of the program");
    }

}
