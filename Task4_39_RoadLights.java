import java.util.Scanner;

public class Task4_39_RoadLights {

    static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("\nTask 4.39. The lightcross.\n");

        System.out.print("Enter the number of minute 0..59 = ");
        int number = reader.nextInt();

        number %= 5;


        switch (number) {
            case 0:
            case 1:

                System.out.print("\nRED\n");

                break;

            case 2:
            case 3:
            case 4:
                System.out.print("\nGREEN\n");
                break;

            default:
                System.out.print("\nERROR\n");
        }


        System.out.print("\nThe end of the program\n");
    }

}
