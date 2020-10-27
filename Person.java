import java.util.Calendar;
//import java.util.Date;
import java.util.Scanner;


public class Person {


    public static void main(String[] args) {
        String firstname = "";
        String lastname = "";
        String patronymic = "";
        int yearOfBithday = 0;
        //String nowYear = new SimpleDateFormat("yyyy").format(new Date());
        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(Calendar.YEAR);
        //System.out.println(nowYear);
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello, can you tell me your firstname?: ");
        firstname = scan.nextLine();
        System.out.print("And what your lastname?: ");
        lastname = scan.nextLine();
        System.out.print("Your patronymic?: ");
        patronymic = scan.nextLine();
        System.out.print("what is your birth year?: ");
        yearOfBithday = scan.nextInt();
        System.out.printf("\nWelcome, %s. %s. %s. You are already %d years old.",
                firstname.charAt(0),
                patronymic.charAt(0),
                lastname,
                nowYear - yearOfBithday);


    }

}
