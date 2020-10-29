import java.util.Scanner;

public class Matrix {

    /*
    Дана таблица из 10 строк и 5 столбцов. Определить:
    1) в какой строке находится значение с порядковым номером
    n, если нумерацию вести построчно сверху вниз, а в каждой
    строке – слева направо;
    2) в какой строке находится это значение.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int strings = 10;
        int columns = 5;
        int maxUnits = strings * columns;
        int numberOfString = 0;
        int numberValueInString = 0;

        System.out.print("Enter n value (between 1 and 50): ");
        int n = scan.nextInt();
        if (n > 0 & n < (maxUnits + 1) & n % columns != 0) {
            numberOfString = (n / columns) + 1;
            numberValueInString = n % columns;
        } else if (n > 0 & n < (maxUnits + 1) & n % columns == 0) {
            numberOfString = n / columns;
            numberValueInString = columns;
        } else System.out.println("ERROR");

        System.out.printf("Well done, the number of string is: %d;\n" +
                "and the number of the value at string is: %d!" +
                "\nThe end of the program", numberOfString, numberValueInString);

    }

}
