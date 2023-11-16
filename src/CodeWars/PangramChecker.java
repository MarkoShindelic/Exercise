package CodeWars;

import java.util.HashMap;

public class PangramChecker {


    public static boolean check(String sentence) {

        HashMap<Character, Integer> charMap = new HashMap<>();


        //removes all characters except for letters, turns them to lowercase and
        // converts a string into a char array

        char[] charArray = sentence.replaceAll("[^a-zA-z]", "").toLowerCase().toCharArray();

        for (char c : charArray) {

            if (charMap.containsKey(c)) {

                charMap.put(c, charMap.get(c) + 1);

            } else {
                charMap.put(c, 1);
            }

        }

        if(charMap.size() == 26){

            return true;
        }

        return false;
    }


    public static void main(String[] args) {

        String pangram1 = "The quick brown fox jumps over the lazy dog.";

        System.out.println(check(pangram1));




    }

}
