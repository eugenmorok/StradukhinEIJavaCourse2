import java.util.Scanner;

public class Boolean3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();


        /*

            Записать условие, которое является истинным, когда:
            а) целое А кратно двум или трем;
            б) целое А не кратно трём и оканчивается нулём.

         */

        String ok = " = true";

        String g1 = "an integer A is a multiple of two or three";                  //  (a % 2 == 0) | (a % 3 == 0)
        String g2 = "the integer A is not a multiple of three and ends in zero";   //  (a % 3 != 0) & (a % 10 == 0)


        String f1 = "(a % 2 == 0) or (a % 3 == 0)";
        String f2 = "(a % 3 != 0) and (a % 10 == 0)";


        if ((a % 2 == 0) | (a % 3 == 0)) System.out.println(g1 + "\n" + f1 + ok + "\n");
        if ((a % 3 != 0) & (a % 10 == 0)) System.out.println(g2 + "\n" + f2 + ok + "\n");


        System.out.println("The end of the program");


    }

}
