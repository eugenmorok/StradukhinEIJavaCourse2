public class New2 {

    public static int leapYearCount(int year) {
        return ((year / 4) - (year / 100)) + (year / 400);
    }

    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean d = true;

        System.out.println(leapYearCount(4));
    }
}
