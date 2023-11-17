package CodeWars;

public class RomanNumerals {

    /*Write two functions that convert a roman numeral to and from an integer value.
    Multiple roman numeral values will be tested for each function.
    Modern Roman numerals are written by expressing each digit separately starting with
    the left most digit and skipping any digit with a value of zero.
    In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
    2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
            Input range : 1 <= n < 4000*/


    public static int romanToInt(String romanNumeral) {

        romanNumeral = romanNumeral.toUpperCase();
        romanNumeral = romanNumeral.replace("CM", "DCCCC");
        romanNumeral = romanNumeral.replace("CD", "CCCC");
        romanNumeral = romanNumeral.replace("XC", "LXXXX");
        romanNumeral = romanNumeral.replace("XL", "XXXX");
        romanNumeral = romanNumeral.replace("IX", "VIIII");
        romanNumeral = romanNumeral.replace("IV", "IIII");

        int number = 0;


        for (int i = 0; i < romanNumeral.length(); i++) {

            if(romanNumeral.charAt(i) == 'M'){
                number += 1000;
            } else if (romanNumeral.charAt(i) == 'D'){
                number += 500;
            } else if (romanNumeral.charAt(i) == 'C') {
                number += 100;
            } else if (romanNumeral.charAt(i) == 'L'){
                number += 50;
            }else if (romanNumeral.charAt(i) == 'X'){
                number += 10;
            }else if (romanNumeral.charAt(i) == 'V'){
                number += 5;
            }else if (romanNumeral.charAt(i) == 'I'){
                number += 1;
            }
        }


        return number;
    }


    public static String intToRoman(int n) {

        StringBuilder sb = new StringBuilder();


        while (n > 0) {

            while (n >= 1000) {

                sb.append("M");
                n -= 1000;
            }
            while (n >= 100) {

                if (n >= 900) {
                    sb.append("CM");
                    n -= 900;
                } else if (n >= 600) {
                    sb.append("DC");
                    n -= 600;
                } else if (n >= 500) {
                    sb.append("D");
                    n -= 500;
                } else if (n >= 400) {
                    sb.append("CD");
                } else {
                    sb.append("C");
                    n -= 100;
                }
            }
            while (n >= 10) {

                if (n >= 90) {
                    sb.append("XC");
                    n -= 90;
                } else if (n >= 60) {
                    sb.append("LX");
                    n -= 60;
                } else if (n >= 50) {
                    sb.append("L");
                    n -= 50;
                } else if (n >= 40) {
                    sb.append("XL");
                    n -= 40;
                } else {
                    sb.append("X");
                    n -= 10;
                }
            }
            while (n >= 1) {

                if (n >= 9) {
                    sb.append("IX");
                    n -= 9;
                } else if (n >= 6) {
                    sb.append("VI");
                    n -= 6;
                } else if (n >= 5) {
                    sb.append("V");
                    n -= 5;
                } else if (n >= 4) {
                    sb.append("IV");
                    n -= 4;
                } else {
                    sb.append("I");
                    n -= 1;
                }
            }

            n /= 10;
        }


        return sb.toString();

    }

    public static void main(String[] args) {


        System.out.println(intToRoman(3999));
        System.out.println(romanToInt("MMCMXXV"));
        System.out.println(romanToInt(intToRoman(4000)));


    }


}