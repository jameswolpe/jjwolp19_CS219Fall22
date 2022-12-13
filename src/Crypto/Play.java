package Crypto;

public class Play {
    public static void main(String [] args){
        System.out.println(3/2);                // 1
        System.out.println(-3/2);               // -1
        System.out.println(Math.floor(-1.25));  // -2.0
        System.out.println(Math.floor(-33.1));  // -34.0
        System.out.println(Math.floor(33.1));   // 33.0
        System.out.println(-5/2);               // -2
        System.out.println(Math.floor(-5/2));    // -2.0
        System.out.println(Math.floor(-5/2.0));  // -3.0
        System.out.println(Math.floorDiv(-3,2)); // -2
        System.out.println("lalal");

        // remainder play
        System.out.println(-15 % 12);               // -3
        System.out.println(-93 % 13);               // -2
        System.out.println(Math.floorMod(-15,12));  // 9
        System.out.println(Math.floorMod(-93,13));  // 11
        System.out.println(6%2);
        System.out.println(Math.floorMod(-16,26));
    }
}

