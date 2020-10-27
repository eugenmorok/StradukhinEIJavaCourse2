import java.math.*;

public class step_2_1_doubleExpression {

    public static boolean doubleExpression(double a, double b, double c) {

        double abs_of_sum = Math.abs((a + b) - c);

        return abs_of_sum < 0.0001;

    }

    public static void main(String[] args) {
        double a = 0.1, b = 0.2, c = 0.3;

        //System.out.println(doubleExpression(a, b, c));
        System.out.println(doubleExpression(a, b, c));

        System.out.println(0x0bp3);


    }

}
