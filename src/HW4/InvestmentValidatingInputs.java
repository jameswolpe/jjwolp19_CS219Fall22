package HW4;

import java.util.Scanner;

public class InvestmentValidatingInputs {

    public static double investment(int c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);
    }

    public static int InitialDeposit(Scanner kbd) {
        boolean x = false;
        int c = 0;

        // validate the initial investment input
        while (!x) {
            System.out.print("Enter an initial deposit as an integer: ");
            if (kbd.hasNextInt()) {
                c = kbd.nextInt();
                if (c < 0) {
                    System.out.printf("Error: initial deposit should be greater than zero. You entered %d \n",
                            c);
                } else {
                    x = true;
                }
            } else {
                System.out.printf("Error: integer expected. You entered \"%s\" \n",
                        kbd.next());
            }
        }
        return c;
    }

    public static double InterestRate(Scanner kbd) {
    boolean x = false;
    double r = 0;
    while(!x){
        // prompt user to input a rate of interest
        System.out.print("Enter an interest rate as a decimal: ");
        // validate interest rate input
        if(kbd.hasNextDouble())
        {
            r = kbd.nextDouble();
            if (r < 0 || r >= 1) {
                System.out.println("Error: interest rate should be expressed as a decimal between 0 and 1");
                System.out.printf("For example 8 percent should be entered as .08. You entered %s \n",
                        r);
            } else{
                x = true;
            }
        }
        else

        {
            System.out.printf("Error: enter a decimal number. You entered \"%s\" \n",
                    kbd.next());
        }
    }
    return r;
    }
    public static int InvestmentYears(Scanner kbd) {
        boolean x = false;
        int t = 0;
        while(!x){
            // prompt user to input value for the number of years to compound over
            System.out.print("Enter the number of years for the investment to compound over: ");
            // validate input
            if (kbd.hasNextInt()) {
                t = kbd.nextInt();
                if (t < 0) {
                    System.out.printf("Error: number of years should be greater than zero. You entered %d \n",
                            t);
                }else{
                    x = true;
                }
            } else {
                System.out.printf("Error: enter an integer. You entered \"%s\" \n",
                        kbd.next());
            }
        }
        return t;
    }
    public static int CompoundPerYear(Scanner kbd){
        boolean x = false;
        int n = 0;
        while(!x){
            // prompt user to input a value for the number of times interest is compounded yearly
            System.out.print("Enter number of times interest is compounded yearly: ");
            if (kbd.hasNextInt()) {
                n = kbd.nextInt();
                if (n < 0) {
                    System.out.printf("Error: number of times interest is compounded should be greater than zero. You entered \"%d\" \n",
                            n);
                }
                else{
                    x = true;
                }
            }
            else {
                System.out.printf("Error: enter an integer. You entered \"%s\" \n",
                        kbd.next());
            }

        }
        return n;
    }


    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);
        //print a message to begin the program
        System.out.println("HW 4. Validating Input.");
        System.out.println("Return on an Investment");
        int c = InitialDeposit(kbd);
        double r = InterestRate(kbd);
        int t = InvestmentYears(kbd);
        int n = CompoundPerYear(kbd);


        // Used for getting input from the keyboard

        System.out.printf("The investment is worth %.2f",
                investment(c,r,t,n));
    }
}
