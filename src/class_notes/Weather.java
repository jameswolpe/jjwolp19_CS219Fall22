package class_notes;

public class Weather {
    public static double weath(double t,    //temperature
                               double v){   //velocity in MPH
        return 35.75 + (0.6215 * t) + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }
    public static void main(String [] args) {
        System.out.println(weath(32.0, 10.0));
    }
}
