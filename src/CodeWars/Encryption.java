package CodeWars;

    /*Encrypt this!

    You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

    Your message is a string containing space separated words.
    You need to encrypt each word in the message using the following rules:
    The first letter must be converted to its ASCII code.
    The second letter must be switched with the last letter
    Keepin' it simple: There are no special characters in the input.
    Examples:
    Kata.encryptThis("Hello") => "72olle"
    Kata.encryptThis("good") => "103doo"
    Kata.encryptThis("hello world") => "104olle 119drlo"*/

public class Encryption {

    public static String letterSwap(String str){

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {

            if (i == 0) {
                sb.append((int) chars[i]); // converts char to ascii code value
            } else if (i == 1) {
                sb.append(chars[chars.length - 1]); //puts last char on second place
            } else if (i == chars.length - 1) {
                sb.append(chars[1]);                // puts second char on last place
            } else {
                sb.append(chars[i]);
            }

        }

        return sb.toString();
    }

    public static String encrypt(String str) {

        if(str.isEmpty()){
            return "";
        }

        String[] newString = str.split("\\s");


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < newString.length; i++) {

            sb.append(letterSwap(newString[i])).append(" "); //calls a function to encrypt words

        }


        return sb.toString().trim(); //removes last space added
    }

    public static void main(String[] args) {


        String test1 = "A wise old owl lived in an oak";
        String result1 = "65 119esi 111dl 111lw 108dvei 105n 97n 111ka";
        String test2 = "Hello";
        String result2 = "72olle";

        System.out.println(encrypt(test1));



    }

}
