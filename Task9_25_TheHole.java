import java.util.Scanner;

public class Task9_25_TheHole {

    static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("\nTask 9.25. To determine the number.\n");

        System.out.print("Enter the positive integer three digits number 100..999 = ");
        int number = reader.nextInt();


        if ((number % 10 > number / 10 % 10) && (number / 100 > number / 10 % 10))

            System.out.println("The number is the hole");
        else
            System.out.println("The number is NOT the hole");


        System.out.print("\nThe end of the program\n");
    }
}
