import java.util.Scanner;

class Task4_94 {

    static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("\nTask 4.94. The definition of digit.\n");

        System.out.print("Enter k = ");
        int k = reader.nextInt();

        int number = (k - 1) / 2 + 10;


        switch (k % 2) {
            case 0:

                System.out.print(number % 10);

                break;

            case 1:
                System.out.print(number / 10);
                break;

            default:
                System.out.print("\nERROR\n");
        }


        System.out.print("\nThe end of the program\n");
    }

}





