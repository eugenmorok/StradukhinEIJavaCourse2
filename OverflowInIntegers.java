public class OverflowInIntegers {

    public static void main(String[] args) {
        //declaring variables with the required values
        byte byte_type = 127;
        short short_type = 32767;
        int int_type = -2147483648;
        long long_type = -9223372036854775808L;
        //the greeting
        System.out.println("Hello friend!");
        System.out.println("-------------------------------------------------------------------------------------" + "\n" +
                "The program demonstrates overflow for positive and negative numbers of the some types" +
                "\n-------------------------------------------------------------------------------------");
        //displaying values on the screen
        System.out.println("the initial number of the byte type: " + (byte_type) + ", the number after the \"+1\" operation: " + (++byte_type));
        System.out.println("the initial number of the short type: " + (short_type) + ", the number after the \"+1\" operation: " + (++short_type));

        System.out.println("the initial number of the int type: " + (int_type) + ", the number after the \"-1\" operation: " + (--int_type));
        System.out.println("the initial number of the long type: " + (long_type) + ", the number after the \"-1\" operation: " + (--long_type));

    }
}
