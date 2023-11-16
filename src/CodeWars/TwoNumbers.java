package CodeWars;

import java.util.Arrays;

public class TwoNumbers {

    public static int[] twoSum(int[] numbers, int target) {

        int[] resultArray = new int[2];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 1; j < numbers.length; j++) {

                if(numbers[i] + numbers[j] == target && i != j){

                    resultArray[0] = i;
                    resultArray[1] = j;
                }

            }
        }

        return resultArray;
    }


    public static void main(String[] args) {

        int[] test = new int[]{1, 2, 3};

        System.out.println(Arrays.toString(twoSum(test, 4)));

    }

}
