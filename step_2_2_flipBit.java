public class step_2_2_flipBit {
    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value    any number
     * @param bitIndex index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        int idx = bitIndex - 1;
        return value ^ (1 << (idx)); // put your implementation here
    }

    public static void main(String[] args) {

        System.out.println(flipBit(7, 2));
    }
}
