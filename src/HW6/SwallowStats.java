package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats(){

        // connect to the web page of speeds
        URL url = null;     //null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double sum = 0.0;
        double count = 0.0;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        while (true) {

        if (!s.hasNextLine())
            break;


        String line = s.nextLine(); // read a line of the website

        if (line.indexOf("#") == -1 && line != "" ) { //modify condition length of line if 0

            sum = sum + Double.parseDouble(line);
            count++;
            if ( min > Double.parseDouble(line)){
                min = Double.parseDouble(line);
            }

            if (max < Double.parseDouble(line)){
                max = Double.parseDouble(line);
            }
        }


        }
        double mean = sum/count;

        System.out.printf(sum);
        System.out.println(count);
        System.out.println(mean);
        System.out.println(max);
        System.out.println(min);
    } //avg_swallow_speed

    public static void main(String [] args) {
        swallow_stats();
    }
}
