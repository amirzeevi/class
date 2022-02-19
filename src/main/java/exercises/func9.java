package exercises;


public class func9 {
    public static String[] makeBoard(int num) {
        String[] board = new String[num * 2 + 1];
        for (int i = 0; i < board.length - 1; i += 2) {
            board[i] = " 0 |";
            board[i + 1] = " X |";
        }
        board[board.length - 1] = "   |";
        return board;
    }

    public static void right(String[] arr, int num, int end) {
        String temp = arr[num];
        arr[num] = arr[num - 1];
        arr[num - 1] = temp;
        for (String j : arr) {
            System.out.print(j);
        }
        int i = num - 1;
        System.out.println("      JR");
        while (i > end) {
            String temp1 = arr[i];
            arr[i] = arr[i - 2];
            arr[i - 2] = temp1;
            for (String j : arr) {
                System.out.print(j);
            }
            i -= 2;
            System.out.println("     JR");
        }
    }

    public static void left(String[] arr, int num, int end) {
        String temp = arr[num];
        arr[num] = arr[num + 1];
        arr[num + 1] = temp;
        for (String j : arr) {
            System.out.print(j);
        }
        System.out.println("      SL");
        int i = num + 1;
        while (i < end) {
            String temp1 = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp1;
            for (String j : arr) {
                System.out.print(j);
            }
            i += 2;
            System.out.println("     JL");
        }
    }

    public static void marbel_game(int num) {
        String[] board = makeBoard(num);
        for (String j : board) {
            System.out.print(j);
        }
        System.out.println();
        int f = 1;
        int b = board.length - 1;
        while (b > num) {
            right(board, b, f);
            b -= 2;
            if (f % 2 == 1 && f == num) {

            } else {
                left(board, f, b);
                f += 2;
            }

        }
    }
        public static void main (String[]args){
            int size = 15;
            marbel_game(size);
        }
    }
