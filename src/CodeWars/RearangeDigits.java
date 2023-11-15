package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RearangeDigits {

    public static int splitNumber( int num) {

        List<Integer> splitNumber = new ArrayList<>();
        int result = 0;

        while (num > 0) {
            splitNumber.add(num % 10);
            num /= 10;
        }

        Collections.sort(splitNumber);
        Collections.reverse(splitNumber);

        for (Integer i : splitNumber) {
            result = result * 10 + i;
        }

        return result;

    }


    public static void main(String[] args) {


        System.out.println(splitNumber(1085));

    }

}
