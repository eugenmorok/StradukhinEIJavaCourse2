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

public class MainParsingThreeDigits_exp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your three digit number (abc): ");
        int number = scan.nextInt();

        int a = number / 100;
        int b = number % 100 / 10;
        int c = number % 10;

        System.out.printf("%d, %d, %d\n", a, b, c);

        a = a ^ b; //
        b = a ^ b; //
        a = a ^ b; //

        System.out.println("xor a and b" + a + "" + b);


    }
}
