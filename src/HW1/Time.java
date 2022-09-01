package HW1;

// exercise 2.3
public class Time {
    public static void main(String [] args) {

        // establish the variables that will be used
        int hour = 21;
        int minute = 55;
        int second = 30;
        //total number of seconds in a day
        int total_day_seconds = (60*60*24);
        // time in seconds since midnight
        int since_midnight = (hour*60+minute)*60+second;

        // variables for time elapsed
        int hour2 = 22;
        int minute2 = 25;
        int second2 = 17;

        // print results
        System.out.println("Number of seconds since midnight:");
        System.out.println(since_midnight);
        System.out.println("Number of seconds remaining in the day:");
        System.out.println(total_day_seconds - since_midnight );
    }
}
