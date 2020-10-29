import java.util.Scanner;

public class ClassRoom_BiteFields {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("\nEnter integer = ");
        int enteredNumber = reader.nextInt();

        System.out.print("\nEnter the number of group [0..7] = ");
        int numberOfGroup = reader.nextInt();

        System.out.print("\nEnter the status [0..15] = ");
        int status = reader.nextInt();


        //int mask = 0b 1011 1111 0011 0000 1111 1111 1111 1111;
		/*0000 0000 0000 0000 0000 0000 1010 1000 = 168
										10	8
		0000 0000 0000 0000 0000 0000 0111 1000 = 120
		*/
        int mask = 15;
        mask <<= 4 * numberOfGroup;
        mask = ~mask;


        enteredNumber = enteredNumber & mask;


        mask = status;
        mask <<= 4 * numberOfGroup;
        enteredNumber = enteredNumber | mask;

        //enteredNumber >>= extent;

        //int b = 0b1010;
        //System.out.println("\n mask = " + mask);

        System.out.println("\nchanged entered Number = " + enteredNumber);


        System.out.print("\nThe end of the program\n");

    }
}