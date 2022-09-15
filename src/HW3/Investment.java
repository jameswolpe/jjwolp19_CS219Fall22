package HW3;

import java.util.Scanner;

public class Investment {
    public static double investment(int c, double r, int t, int n) {
        return c * Math.pow(1 + r/n, t*n);
    }
    public static void main(String [] args) {

        //print a message to begin the program
        System.out.println("HW 3. Validating Input.");
        System.out.println("Return on an Investment");

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        //prompt the user to input an initial deposit
        System.out.print("Enter an initial deposit as an integer: ");
        int c;

        // validate the initial investment input
        if (kbd.hasNextInt()) {
            c = kbd.nextInt();
            if (c < 0) {
                System.out.printf("Error: initial deposit should be greater than zero. You entered %d",
                        c);
                return;
            }
        }
        else {
            System.out.printf("Error: integer expected. You entered \"%s\"",
                    kbd.next());
            return;
        }
        // prompt user to input a rate of interest
        System.out.print("Enter an interest rate as a decimal: ");
        double r;

        // validate interest rate input
        if (kbd.hasNextDouble()) {
            r = kbd.nextDouble();
            if (r < 0 || r > 1) {
                System.out.println("Error: interest rate should be expressed as a decimal between 0 and 1");
                System.out.printf("For example 8 percent should be entered as .08. You entered \"%s\"",
                        r);
                return; //
            }
        }
        else {
            System.out.printf("Error: enter a decimal number. You entered \"%s\"",
                    kbd.next());
            return;
        }

        // prompt user to input value for the number of years to compound over
        System.out.print("Enter the number of years for the investment to compound over: ");
        int t;

        // validate input
        if (kbd.hasNextInt()) {
            t = kbd.nextInt();
            if (t < 0) {
                System.out.printf("Error: number of years should be greater than zero. You entered %d",
                        t);
                return;
            }
        }
        else {
            System.out.printf("Error: enter an integer. You entered \"%s\"",
                    kbd.next());
            return;
        }

        // prompt user to input a value for the number of times interest is compounded yearly
        System.out.print("Enter number of times interest is compounded yearly: ");
        int n;

        if (kbd.hasNextInt()) {
            n = kbd.nextInt();
            if (n < 0) {
                System.out.printf("Error: number of times interest is compounded should be greater than zero. You entered \"%d\"",
                        n);
                return;
            }
        }
        else {
            System.out.printf("Error: enter an integer. You entered \"%s\"",
                    kbd.next());
            return;
        }


        System.out.println(investment(c,r,t,n));
    }
}
