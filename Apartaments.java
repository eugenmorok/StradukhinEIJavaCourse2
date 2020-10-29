import java.util.Scanner;

public class Apartaments {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of the apartment (1...20): ");
        int numberOfApart = scan.nextInt();
        int groupSize = 20 / 5;
        int groupNumber;

        if (numberOfApart % groupSize == 0) {
            groupNumber = numberOfApart / groupSize;
        } else {
            groupNumber = numberOfApart / groupSize + 1;
        }

        System.out.print("The floor of your need is: " + groupNumber);
    }

}
