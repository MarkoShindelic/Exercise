package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Persistence {


    public static List<Integer> splitNumber(int num) {

        List<Integer> splitNumber = new ArrayList<>();

        while (num > 0) {
            splitNumber.add(num % 10);
            num /= 10;
        }

        Collections.reverse(splitNumber);

        return splitNumber;
    }

    public static int multiplication(List<Integer> numbers) {

        int product = 1;

        for (Integer i : numbers) {
            product *= i;
        }

        return product;
    }

    public static int timesOfMultiplications(int num) {

        int counter = 1;

        int something = multiplication(splitNumber(num));

        while(something > 9){

            something = multiplication(splitNumber(something));
            counter++;
        }

        return counter;
    }


    public static int persistence(int num) {


        if (num >= 0 && num <= 9) {
            return 0;
        }

        else {
            return timesOfMultiplications(num);
        }
    }

    public static void main(String[] args) {

        System.out.println(persistence(25));


    }

}
