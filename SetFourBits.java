import java.util.Scanner;

public class SetFourBits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The program sets 4 consecutive bits in an int variable" +
                " to the value specified by the user (from 0 to 15)");
        System.out.print("Enter your number: ");
        int input_number = scan.nextInt(); // int number
        System.out.print("Enter number of change group: ");
        int input_group = scan.nextInt(); // 0...7
        System.out.print("Enter new value of the group: ");
        int new_group_value = scan.nextInt(); // 0...15
        input_group *= 4;
        int mask = 2147483632;
        int sub_mask = mask << input_group;
        input_number = input_number & sub_mask;
        new_group_value = new_group_value << input_group;
        int output_number = input_number | new_group_value;

        System.out.println(output_number);

        System.out.println("The end of the program");





    }


}
