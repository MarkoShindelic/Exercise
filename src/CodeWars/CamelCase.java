package CodeWars;

import java.util.Arrays;


public class CamelCase {

    public static String camelCase(String input) {


        String[] newInput = input.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < newInput.length; i++) {

            if(!newInput[i].equalsIgnoreCase(",")){

                sb.append(newInput[i]).append(" ");
            }

        }

        return sb.toString().trim();
    }


    public static void main(String[] args) {


        System.out.println(camelCase("camelCasingTest"));


    }
}
