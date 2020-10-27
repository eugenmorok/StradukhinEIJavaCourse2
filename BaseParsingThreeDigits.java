import java.util.Scanner;

public class BaseParsingThreeDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int new_number = 0;
        System.out.println("This program performs several operations with a three-digit number and displays the result on the screen.");
        System.out.print("And now, please tell me what a number (100...999) do you give me >>> ");
        new_number = scan.nextInt();
        int t_pos = new_number % 10;
        int s_pos = (new_number / 10) % 10;
        int f_pos = new_number / 100;
        System.out.printf("a.) your digits is:\n%d\n%d\n%d\n", f_pos, s_pos, t_pos);
        System.out.printf("b.) sum the digits of the number:\n%d\n", f_pos + s_pos + t_pos);
        System.out.printf("c.) multiplication the digits of the number:\n%d\n", f_pos * s_pos * t_pos);
        System.out.println("\nThe end of the program");
    }
}
