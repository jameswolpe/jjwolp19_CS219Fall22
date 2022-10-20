package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double t,    // temperature
                                   double v) {  // velocity in MPH
        return 35.75 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }

    public static double getVelocity(Scanner kbd) {
        double velocity = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter wind velocity in MPH: ");
            if (kbd.hasNextDouble()) {
                velocity = kbd.nextDouble();
                if (velocity < 0) {
                    System.out.printf("Error: velocity cannot be negative. You entered %.2f");
                } else {
                    valid = true;
                }
                valid = true;
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"",
                        kbd.next());

            }
        }
        return velocity;

    }

    public static double getTemperature(Scanner kbd) {
        double temperature = 0;
        boolean valid = false;
        while(!valid){


        System.out.print("Enter temperature in degrees F: ");

        // Make sure the user entered a number
        if (kbd.hasNextDouble()) {
            temperature = kbd.nextDouble();
        } else {
            System.out.printf("Error: please enter a decimal number. You entered \"%s\"",
                    kbd.next());
        }
    }
        return temperature;  // exit main

    }


    public static void main(String [] args) {

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);


        double velocity = getVelocity(kbd);
        double temperature = getTemperature(kbd);

        System.out.printf("The windchill for %.1f degrees at %.1f MPH is %.2f\n",
                temperature, velocity, windchill(temperature, velocity));
    }

}