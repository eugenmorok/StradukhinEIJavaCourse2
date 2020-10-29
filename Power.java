import java.util.Scanner;

public class Power {
    /*
    Дано вещественное число. Пользуясь только операцией умножения, полу-
    чить степень:
    а) 4 за две операции;
    б) 6 за три операции;
    в) 7 за четыре операции;
    г) 8 за три операции;
    д) 9 за четыре операции;
    е) 10 за четыре операции;
    ж) 13 за пять операций;
    з) 15 за пять операций;
    и) 21 за шесть операций;
    к) 28 за шесть операций;
    л) 64 за шесть операций.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the double number here: ");
        double v1 = scan.nextDouble();
        //a 2 actions
        double v2 = v1 * v1;
        double v4 = v2 * v2;
        //b 3 actions
        double v6 = v4 * v2;
        //c 4 actions
        double v7 = v6 * v1;
        //d 3 actions
        double v8 = v4 * v4;
        //e 4 actions
        double v5 = v4 * v1;
        double v9 = v5 * v4; // 1(v1 * v1) -- v3; 2(v2 * v2) -- v4; 3(v4 * v1) -- v5; 4(v4 * v5) == v9
        //f 4 actions
        double v10 = v5 * v5;
        //g 5 actions
        double v13 = v9 * v4;
        //h 5 actions
        double v15 = v10 * v5;
        //i 6 actions
        double v21 = v10 * v10 * v1; // 1:1+1=2 2:2+2=4 3:4+1=5 4:5+5=10 5:10+10=20 6:20+1=21
        //j 6 actions
        double v16 = v8 * v8;
        double v24 = v16 * v8;
        double v28 = v24 * v4; // 1(1*1)=2 2(2*2)=4 3(4*4)=8 4(8*8)=16 5(16*8)=24 6(24*4)=28
        //k 6 actions
        double v32 = v16 * v16;
        double v64 = v32 * v32; // 1:1+1=2 2:2+2=2 3:4+4=8 4:8+8=16 5:16+16=32 6:32+32=64

        System.out.println("Your answers: ");
        System.out.println(
                v1 + "^4 = " + v4 + "\n" +
                v1 + "^6 = " + v6 + "\n" +
                v1 + "^7 = " + v7 + "\n" +
                v1 + "^8 = " + v8 + "\n" +
                v1 + "^9 = " + v9 + "\n" +
                v1 + "^10 = " + v10 + "\n" +
                v1 + "^13 = " + v13 + "\n" +
                v1 + "^15 = " + v15 + "\n" +
                v1 + "^21 = " + v21 + "\n" +
                v1 + "^28 = " + v28 + "\n" +
                v1 + "^64 = " + v64 + "\n" +
                "The end of the program");


    }
}
