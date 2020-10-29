/* FourByteToInt.java
Принять 4 числа типа byte от пользователя и положить их в одну переменную типа int. Вывести int-овую переменную.
Запросить от пользователя номер от 0 до 3 числа, которое он хочет получить,  и вывести соответствующее число.
byte 8 битный, int 32 битный.
 */

import java.util.Scanner;

public class FourByteToInt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        byte in1, in2, in3, in4;

        int storage = 0;

        System.out.print("Please enter your first byte number: ");
        in1 = scan.nextByte();
        System.out.print("Please enter your second byte number: ");
        in2 = scan.nextByte();
        System.out.print("Please enter your third byte number: ");
        in3 = scan.nextByte();
        System.out.print("Please enter your fourth byte number: ");
        in4 = scan.nextByte();

        int s1 = in1 << 12;
        int s2 = in2 << 8;
        int s3 = in3 * 16;
        int s4 = in4;

        storage |= s1;
        storage |= s2;
        storage |= s3;
        storage |= s4;

        System.out.print("Your new integer variable: ");
        System.out.println(storage);


        System.out.println("Enter your group number (0...3): ");
        byte group_num = scan.nextByte();

        if (group_num >= 0 & group_num < 4) {

            switch (group_num) {

                case (0):
                    System.out.println(in1);
                    break;

                case (1):
                    System.out.println(in2);
                    break;

                case (2):
                    System.out.println(in3);
                    break;

                case (3):
                    System.out.println(4);
                    break;

            }
        } else System.out.println("Sorry, but your group number is incorrect!");

        System.out.println("The end of the program");


    }

}
