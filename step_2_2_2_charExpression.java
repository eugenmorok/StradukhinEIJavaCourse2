public class step_2_2_2_charExpression {
    /**
     * Flips one bit of the given <code>value</code>.

     */
    public static char charExpression(int a) {
        return (char)('\\' + a); // put your implementation here
    }

    public static void main(String[] args) {

        System.out.println(charExpression(32));
    }
}
