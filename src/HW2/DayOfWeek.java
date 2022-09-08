package HW2;
/* James Wolpe
* 09/08/2022
* Homework 2
* Professor Harcourt
 */

import java.util.Scanner;

public class DayOfWeek {
    public static int dayofweek(int m, int d, int y) {
        int y0 = y - (14 - m)/12;
        int x = y0 +y0/4 - y0/100 +y0/400;
        int m0 = m + 12*((14 - m)/12)-2;
        return (d + x + 31*m0/12)%7;

    }
    public static void main(String [] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a month as an integer: ");
        int month = kbd.nextInt();

        System.out.print("Enter a day of the month: ");
        int day = kbd.nextInt();

        System.out.print("Enter a year: ");
        int year = kbd.nextInt();

        System.out.println(dayofweek(month, day, year));
    }
}
