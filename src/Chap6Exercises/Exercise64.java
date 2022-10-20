package Chap6Exercises;

public class Exercise64 {
    public static boolean isAbecedarian(String s) {
        for (int i =0; i < s.length() - 1; i++) {

            if (s.charAt(i) > s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
    public static String toLower(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                r = r + (char) ('a' + (ch - 'A'));
            }
            else{
                r = r +ch;
            }
        } // for
        return r;
    }
    public static boolean AbcWhile(String s){
        s = s.toLowerCase();
        s = toLower(s);
        int i=0;
        while(i < s.length()-1) {
            if (s.charAt(i) > s.charAt(i+1)) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String [] args){
        System.out.println(AbcWhile("biopsy"));
        System.out.println(!AbcWhile("apple"));
        System.out.println(toLower("AppLe"));
    }
}