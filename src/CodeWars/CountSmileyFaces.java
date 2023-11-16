package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class CountSmileyFaces {

    // "[:;][-~]?[)D]" regex I couldn't figure out
    // "^[:;][-~]?[)D]$" regex that didn't work for me

    public static int countSmileys(List<String> arr) {

        int counter = 0;


        for (String s : arr){

            if(s.length() == 2){
                if((s.charAt(0) == ':' || s.charAt(0) == ';') && (s.charAt(1) == 'D' || s.charAt(1) == ')')){
                    counter++;
                }
            }
            if(s.length() == 3){
                if((s.charAt(0) == ':' || s.charAt(0) == ';') && (s.charAt(2) == 'D' || s.charAt(2) == ')')
                    && (s.charAt(1) == '-' || s.charAt(1) == '~')){
                    counter++;
                }
            }

        }


        return counter;
    }


    public static void main(String[] args) {


        List<String> a =  new ArrayList<>();
        // a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");


        System.out.println(countSmileys(a));

    }

}