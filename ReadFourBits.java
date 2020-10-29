import java.util.Scanner;
/*
Считать 4 подряд идущих бита, которые укажет пользователь (от 0 до 7). в int-овой переменной в отдельную переменную.
Номер группы из 4 бит запрашивается у пользователя. Групп всего 8: от 0 до 7. Считаем справа налево, то есть 4 младших
бита соответствуют 0 группе.
 */
public class ReadFourBits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        System.out.print("Enter group number: ");
        int groupnum = scan.nextInt() * 4;
        int groupval = number >>> groupnum;
        int mask = 15;
        groupval &= mask;
        System.out.println("Your new number is: ");
        System.out.println(groupval);
        System.out.println("The end of the program");
    }
}
