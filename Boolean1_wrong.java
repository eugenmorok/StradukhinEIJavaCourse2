import java.util.Scanner;

public class Boolean1_wrong {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("x = ");
        int x = scan.nextInt();
        System.out.print("y = ");
        int y = scan.nextInt();

        String guess1 = "х > 2 and у > 3";
        String guess2 = "х > 1 or y > 2";
        String guess3 = "х > 0 and у < 5";
        String guess4 = "х > 3 or x < 1";
        String guess5 = "х > 3 and x < 10";
        String guess6 = "not х > 2";
        String guess7 = "not х > 0 and х < 5";
        String guess8 = "not х > 0 and not х < 5";
        String guess9 = "10 < x < 20";
        String guess10 = "0 < y < 4 and x < 5";
        String ok = " = true";

        if (x > 2 & y > 3) {
            System.out.println(guess1 + ok);
            if (x > 1 | y > 2) {
                System.out.println(guess2 + ok);
                if (x > 0 & y < 5) {
                    System.out.println(guess3 + ok);
                    if (x > 3 | x < 1) {
                        System.out.println(guess4 + ok);
                        if (x > 3 & x < 10) {
                            System.out.println(guess5 + ok);
                            if (!(x > 2)) {
                                System.out.println(guess6 + ok);
                                if (!(x > 0) & x < 5) {
                                    System.out.println(guess7 + ok);
                                    if (!(x > 0) & !(x < 5)) {
                                        System.out.println(guess8 + ok);
                                        if (x < 20 & x > 10) {
                                            System.out.println(guess9 + ok);
                                            if ((y > 0 & y < 4) & x < 5) {
                                                System.out.println();
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }

                }

            }

        }


    }
}


