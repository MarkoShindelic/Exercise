package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitalRoot {


    /*Given n, take the sum of the digits of n. If that value has more than one digit,
    continue reducing in this way until a single-digit number is produced. The input will
    be a non-negative integer.*/


    public static List<Integer> splitNuber(int num){

        List<Integer> splitNumber = new ArrayList<>();

        while (num > 0) {
            splitNumber.add(num % 10);
            num /= 10;
        }

        Collections.reverse(splitNumber);

        return splitNumber;

    }

    public static int digitsSum(int n){

        int sum = 0;

        for(Integer i : splitNuber(n)){
            sum += i;
        }

        return sum;
    }

    public static int digitalRoot(int n){

        int temp = digitsSum(n);

        if(n <= 9){
            return n;
        }
        else {

            while(temp > 9){
              temp = digitsSum(temp);
            }

            return temp;
        }



    }

    public static void main(String[] args) {


        System.out.println(digitalRoot(98477));

    }

}
