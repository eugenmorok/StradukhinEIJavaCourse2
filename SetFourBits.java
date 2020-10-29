import java.util.Scanner;

public class SetFourBits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The program sets 4 consecutive bits in an int variable" +
                " to the value specified by the user (from 0 to 15)");
        System.out.print("Enter your number: ");
        int input_number = scan.nextInt(); // int number
        System.out.print("Enter number of change group (from 0 to 7): ");
        int input_group = scan.nextInt(); // 0...7
        System.out.print("Enter new value of the group (from 0 to 15): ");
        int new_group_value = scan.nextInt(); // 0...15
        input_group *= 4;
        int mask = 15;
        int sub_mask = mask << input_group;
        sub_mask = ~sub_mask;

        input_number = input_number & sub_mask;
        new_group_value = new_group_value << input_group;
        int output_number = input_number | new_group_value;

        System.out.println(output_number);

        System.out.println("The end of the program");


    }


}
