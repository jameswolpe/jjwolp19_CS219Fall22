package HW1;

// exercise 2.3
public class Time {
    public static void main(String [] args) {

        // establish the variables that will be used
        int hour = 21;
        int minute = 55;
        int second = 30;
        //total number of seconds in a day
        double total_day_seconds = (60*60*24);
        // time in seconds since midnight
        double since_midnight = (hour*60+minute)*60+second;

        // variables for time elapsed
        int hour2 = 22;
        int minute2 = 25;
        int second2 = 17;
        double since_midnight2 = (hour2*60+minute2)*60+second2;

        // print results
        // seconds since midnight
        System.out.println("Number of seconds since midnight:");
        System.out.println(since_midnight);

        // seconds remaining in the day
        System.out.println("Number of seconds remaining in the day:");
        System.out.println(total_day_seconds - since_midnight );

        // percentage of day left
        double perc_day = (since_midnight/total_day_seconds * 100);
        System.out.println("Percentage of day that has passed:");
        System.out.println(perc_day);

        //time since i've started this assingment
        System.out.println("Seconds elapsed since I've started this exercise:");
        double time_ellapsed = since_midnight2 - since_midnight;
        System.out.println(time_ellapsed);

    }
}
