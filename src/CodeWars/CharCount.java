package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class CharCount {


    public static Map<Character, Integer> count(String str) {

        Map<Character, Integer> charCount = new HashMap<>();

        char[] arr = str.toCharArray();

        for(Character c: arr){

            if(charCount.containsKey(c)){

                charCount.put(c, charCount.get(c) + 1);
            }
            else {

               charCount.put(c,1);

            }


        }

        return charCount;
    }

    public static void main(String[] args) {

        String test = "aabb bac";

        System.out.println(count(test));

    }

}
