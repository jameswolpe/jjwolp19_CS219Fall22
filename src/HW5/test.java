package HW5;


public class test {

    public static boolean canSpell(String word, String tiles) {
        for(int i =0; i < word.length(); i++){
            int ch = tiles.indexOf(word.charAt(i));

            if(ch == -1)
                return false;
            else{
                tiles = tiles.substring(0, ch) + tiles.substring(ch + 1, tiles.length());
            }
        }
        return true;


    }

    public static void main(String [] args) {
        System.out.println(canSpell("boot", "butt"));
        System.out.println(canSpell("hippo", "hpposffweif"));

        // Student: add more test cases
    }
}