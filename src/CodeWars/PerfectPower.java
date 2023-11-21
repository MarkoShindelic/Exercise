package CodeWars;

import java.util.Arrays;

public class PerfectPower {

    /*A perfect power is a classification of positive integers:
       In mathematics, a perfect power is a positive integer that can be expressed as an integer power
       of another positive integer. More formally, n is a perfect power
        if there exist natural numbers m > 1, and k > 1 such that mk = n.
       Your task is to check wheter a given integer is a perfect power.
       If it is a perfect power, return a pair m and k with mk = n as a proof.
       Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.
       Note: For a perfect power, there might be several pairs.
       For example 81 = 3^4 = 9^2, so (3,4) and (9,2) are valid solutions.
       However, the tests take care of this, so if a number is a perfect power,
       return any pair that proves it.*/

    public static int[] isPerfectPower(int n){

        double[] arr = new double[2];

        if(n == 0 || n == 1){
            return null;
        }

        for (int i = 2; i < 9; i++) {

            double temp = Math.pow(n, (double) 1 / i);
            temp = (double) Math.round(temp * 10) / 10;


            if(Math.pow(temp, i) == n){
                arr[0] = temp;
                arr[1] = i;
                break;
            }
        }

        int[] result = new int[2];

        result[0] = (int) arr[0];
        result[1] = (int) arr[1];

        if(result[0] == 0 || result[1] == 0){
            return null;
        }

        return result;
    }



    public static void main(String[] args) {

        System.out.println(Arrays.toString(isPerfectPower(1)));

    }

}
