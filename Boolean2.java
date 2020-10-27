import java.util.Scanner;

public class Boolean2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();
        System.out.print("B = ");
        int b = scan.nextInt();
        System.out.print("C = ");
        int c = scan.nextInt();

        /*

         Записать условие, которое является истинным, когда:
        а) каждое из чисел А и В больше 100;
        б) только одно из чисел А и В чётное;
        в) хотя бы одно из чисел А и В положительно;
        г) каждое из чисел А, В, С кратно трём;
        д) только одно из чисел А, В и С меньше 50;
        е) хотя бы одно из чисел А, В, С отрицательно.

         */

        String ok = " = true";

        String g1 = "each of the numbers A and B is greater than 100";     //  a > 100 & b > 100
        String g2 = "only one of the numbers A and B is even";             //  (a % 2 == 0) ^ (b % 2 == 0)
        String g3 = "at least one of the numbers A and B is positive";     //  (a > 0 ) | (b > 0)
        String g4 = "each of the numbers A, B, C is a multiple of three";  //  (a % 3 == 0) & (a % 3 == 0) & (a % 3 == 0)
        String g5 = "only one of the numbers A, B and C is less than 50";  //  (a < 50) ^ (b < 50) ^ (c < 50)
        String g6 = "at least one of the numbers A, B, C is negative";     //  (a < 0) | (b < 0) | (c < 0)

        String f1 = "a > 100 & b > 100";
        String f2 = "(a % 2 == 0) ^ (b % 2 == 0)";
        String f3 = "(a > 0 ) | (b > 0)";
        String f4 = "(a % 3 == 0) & (a % 3 == 0) & (a % 3 == 0)";
        String f5 = "(a < 50) ^ (b < 50) ^ (c < 50)";
        String f6 = "(a < 0) | (b < 0) | (c < 0)";

        if (a > 100 & b > 100) System.out.println(g1 + "\n" + f1 + ok + "\n");
        if ((a % 2 == 0) ^ (b % 2 == 0)) System.out.println(g2 + "\n" + f2 + ok + "\n");
        if ((a > 0 ) | (b > 0)) System.out.println(g3 + "\n" + f3 + ok + "\n");
        if ((a % 3 == 0) & (a % 3 == 0) & (a % 3 == 0)) System.out.println(g4 + "\n" + f4 + ok + "\n");
        if ((a < 50) ^ (b < 50) ^ (c < 50)) System.out.println(g5 + "\n" + f5 + ok + "\n");
        if ((a < 0) | (b < 0) | (c < 0)) System.out.println(g6 + "\n" + f6 + ok + "\n");

        System.out.println("The end of the program");


    }

}
