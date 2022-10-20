package Chap6Exercises;

public class Exercise65 {
    /*
    * Return true if every letter in s appears exactly twice
     */
    public static boolean isDubloon(String s) {
        for (int i = 0; i < s.length(); i++){
            int cnt = 0;
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)) {
                    cnt++;
                }
            } // for
            if (cnt != 2) {
                return false;
            }
        }// for
        return true;
    }
    public static void main(String [] args){
        System.out.println(isDubloon("poop"));
    }
}
