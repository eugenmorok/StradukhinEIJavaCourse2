import java.util.Scanner;

/*
InterleaveTwoNumbers.java
Написать программу, в которой принимаются от пользователя два трёхзначных числа, а выводится число, полученное
из чередующихся цифр первого и второго числа. Пример: вводятся 123 и 456, вывод 142536. Число должно не
просто выводиться в консоль, а действительно сохраняться в переменной.
 */
public class InterleaveTwoNumbers {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter a two three-digit number to interleave");
        System.out.print("Number a: ");
        int a = scann.nextInt();
        System.out.print("Number b: ");
        int b = scann.nextInt();

        int a1 = a / 100;
        int a2 = a / 10 % 10;
        int a3 = a % 10;

        int b1 = b / 100;
        int b2 = b / 10 % 10;
        int b3 = b % 10;

        int c = a1 * 100000 + b1 * 10000 + a2 * 1000 + b2 * 100 + a3 * 10 + b3;

        System.out.println(c);


        System.out.println("The end");

    }
}
