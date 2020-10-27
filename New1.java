public class New1 {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((!c) & (!d) & a & b) ^((!a) & (!d) & b & c) ^ ((!a) & (!b) & c & d) ^ ((!b) & (!c) & d & a) ^ ((!b) & (!d) & c & a) ^ ((!a) & (!c) & b & d);
    }

    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean d = true;

        System.out.println(booleanExpression(a, b, c, d));
    }
}
