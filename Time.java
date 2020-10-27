import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        long seconds_from_begining = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Hello my friend, let's play! Would you like to help me now?\n" +
                "Please enter here the number of seconds from the begin today midnight >>> ");
        seconds_from_begining = scan.nextLong();
        long hours_from_begining = seconds_from_begining / 3600;
        long minutes_from_last_hours = (seconds_from_begining - hours_from_begining * 3600) / 60;
        long seconds_from_last_minute = seconds_from_begining - (hours_from_begining * 3600) - (minutes_from_last_hours * 60);
        System.out.println("OK, thank you, and I understand now that:");
        System.out.printf("it's been %d whole hours since midnight,\nit's been %d whole " +
                        "minutes since last hour and\nfinally %d " +
                        "whole seconds since last minute."
                , hours_from_begining, minutes_from_last_hours, seconds_from_last_minute);
        System.out.println("\nGoodbye, the end of the program!");

    }

}
