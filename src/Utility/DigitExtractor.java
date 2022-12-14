package Utility;

public class DigitExtractor {
    public static int last(int n) {
        if (n < 0) {
            n = -n;
        }
        return n % 10;
    }
    public static int secondToLast(int j) {
        j = j /10;
        if (j < 0) {
            j = -j;
        }
        return j%10;
    }
    public static void main(String []args) {
        System.out.println(last(2753) == 3);
        System.out.println(last(-749) == 9);
        System.out.println(secondToLast(-749)==4);


    }
}
