import java.util.Scanner;
/*
ConcatenationTwoNumbers.java
Написать программу, в которой принимаются от пользователя два трёхзначных числа, а выводится число,
полученное вставкой первого числа перед вторым. Пример: вводятся 123 и 456, вывод 123456. Число должно
не просто выводиться в консоль, а действительно сохраняться в переменной.
 */
public class ConcatenationTwoNumbers {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter a two three-digit number to concat");
        System.out.print("Number a: ");
        int a = scann.nextInt();
        System.out.print("Number b: ");
        int b = scann.nextInt();
        System.out.print("Result of concat: ");
        int c = a * 1000 + b;
        System.out.println(c);









        System.out.println("The end");

    }
}
