public class MaxMinIntegers {

    public static void main(String[] args) {
        //declaring variables with the required values
        byte byte_type = 127;
        short short_type = 32767;
        int int_type = 2147483647;
        long long_type = 9223372036854775807L;
        //the greeting
        System.out.println("Hello friend!");
        System.out.println("--------------------------------------------------------------\n" +
                "This program shows the largest and smallest values of the types" +
                "\n--------------------------------------------------------------");
        //displaying values on the screen
        System.out.println("byte type max length is " + (byte_type) + ", byte type min length is " + (++byte_type));
        System.out.println("short type max length is " + (short_type) + ", byte type min length is " + (++short_type));
        System.out.println("int type max length is " + (int_type) + ", byte type min length is " + (++int_type));
        System.out.println("long type max length is " + (long_type) + ", byte type min length is " + (++long_type));

    }
}
