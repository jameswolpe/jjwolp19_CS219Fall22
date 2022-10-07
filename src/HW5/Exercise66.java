package HW5;

public class Exercise66 {
    public static boolean canSpell(String word, String tiles) {

        for (int i = 0; i < word.length(); i++) {
            // character index variable
            int ch = tiles.indexOf(word.charAt(i));

            if (ch == -1) {
                // if character is not in tiles
                return false;
            }
            //if character is in tiles
            // Ensure that you do not reuse a character
            else {
                tiles = tiles.substring(0, ch) + tiles.substring(ch + 1);
            }
        } // end of for loop
        return true;
    }

    public static void main(String[] args) {

        System.out.println(canSpell("boot", "axobasrto"));

        System.out.println(!canSpell("hippo", "haxobapsrito"));


        // Student: add more test cases
        System.out.println(canSpell("james", "semkkjjaa"));

        System.out.println(!canSpell("commons", "comonsssnn"));

        System.out.println(canSpell("tennis", "lonainefsft"));

        System.out.println(!canSpell("backgammon", "4401*^&(%)#"));
    }

}