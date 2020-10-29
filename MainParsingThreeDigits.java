import java.util.Scanner;

/*
Основной парсинг целых чисел:


MainParsingThreeDigits.java
Вводится трёхначное число. Вывести:
а) число с обратным порядком цифр;
б) число, в котором единицы исходного числа стали сотнями, десятки - единицами, сотни - десятками.
abc -> cab
в) abc -> bca+
г) abc -> bac
д) abc -> acb
е) abc -> cba+
 */

public class MainParsingThreeDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your three digit number (abc): ");
        int number = scan.nextInt();

        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % (number / 10);

        System.out.printf("%d, %d, %d\n", a, b, c);


        if (number % 10 != 0) {

            int cba = a + b * 10 + c * 100;
            int bca = b * 100 + c * 10 + a;
            int bac = b * 100 + a * 10 + c;
            int acb = a * 100 + c * 10 + b;

            System.out.println("abc --> cba (reverse number): " + cba);
            System.out.println("abc --> bca (number where the original units of number\n" +
                    "became to hundreds, tens to units, hundreds to tens): " + bca);
            System.out.println("abc --> bac: " + bac);
            System.out.println("abc --> acb: " + acb);

        } else {

            System.out.printf("abc --> cba (reverse number): %d%d%d\n", c, b, a);
            System.out.printf("abc --> bca (number where the original units of number\n" +
                    "became to hundreds, tens to units, hundreds to tens): %d%d%d\n", b, c, a);
            System.out.printf("abc --> bac: %d%d%d\n", b, a, c);
            System.out.printf("abc --> acb: %d%d%d\n", a, c, b);

        }
        System.out.println("The end of the program");
    }
}
