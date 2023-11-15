package CodeWars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

    //Simple program that converts a binary number to decimal number
    public static int convertBinaryArrayToInt(List<Integer> binary){

       int result = 0;
       int exp = binary.size() -1;

        for (int i = 0; i < binary.size(); i++, exp--) {

            result += (int) (binary.get(i) * Math.pow(2, exp));
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        number.add(1); number.add(1); number.add(1); number.add(1);

        System.out.println(convertBinaryArrayToInt(number));

    }

}
