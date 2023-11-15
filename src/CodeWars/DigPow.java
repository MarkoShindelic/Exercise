package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigPow {

    public static List<Integer> splitNumber(int number){

        List<Integer> splitNumber = new ArrayList<>();

        while(number > 0){
            splitNumber.add(number % 10);
            number /= 10;
        }

        Collections.reverse(splitNumber);

        return splitNumber;

    }

    public static int sumOfExponents(int number, int exponent){
        int result = 0;

        List<Integer> splitNumber = splitNumber(number);

        for (int i = 0; i < splitNumber.size(); i++) {

            result += (int) Math.pow(splitNumber.get(i), exponent++);

        }

        return result;
    }


    public static int digPow(int n, int p){

        int sum = sumOfExponents(n, p);

        if(sum % n == 0){
            return sum / n;
        }
        return -1;

    }



    public static void main(String[] args) {

        //System.out.println(splitNumber(695));
        System.out.println(digPow(46288, 3));


    }

}
