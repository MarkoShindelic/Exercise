package CodeWars;

public class Square {

    //Program that checks if a number is a square number
    public static boolean isSquare(int n) {

        if (Math.sqrt(n) % 1 == 0) {

            return true;
        }

        return false;
    }


    public static void main(String[] args) {


        System.out.println(isSquare(16));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-3));
        System.out.println(isSquare(-16));

    }

}
