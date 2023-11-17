package CodeWars;

public class TicTacToeChecker {


    public static boolean checkForZero(int[][] board){

        boolean result = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0){
                    result = true;
                }
            }
        }

        return result;

    }

    public static int isSolved(int[][] board) {

        int result = 0;

        if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {        //first row 1
            result = 1;
        } else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) { //second row 1
            result = 1;
        } else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) { // third row 1
            result = 1;
        } else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) { //first row 2
            result = 2;
        } else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) { //second row 2
            result = 2;
        } else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) { // third row 2
            result = 2;
        } else if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) { // first column 1
            result = 1;
        } else if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) { //second column 1
            result = 1;
        } else if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) { //third column 1
            result = 1;
        } else if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) { //first column 2
            result = 2;
        } else if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) { //second column 2
            result = 2;
        } else if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) { //third column 2
            result = 2;
        } else if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) { //left diagonal 1
            result = 1;
        } else if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1) { //right diagonal 1
            result = 1;
        } else if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) { //left diagonal 2
            result = 2;
        } else if (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2) { //right diagonal 2
            result = 2;
        } else if ((result != 1 && result != 2) && checkForZero(board)) {
            result = -1;
        }

        return result;
    }

    public static String result(int num) {

        String result = "";

        switch (num) {
            case -1:
                result = "Not finished yet!";
                break;
            case 1:
                result = "X won!";
                break;
            case 2:
                result = "Y won!";
                break;
            case 0:
                result = "It's a draw!";
                break;
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] board = new int[][]{
                {1, 2, 1},
                {1, 0, 2},
                {2, 1, 1}};


        int result = isSolved(board);

        System.out.println(result(result) + " " + result);

    }


}