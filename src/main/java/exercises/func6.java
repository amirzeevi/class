package exercises;

public class func6 {
    public static boolean sum_of_sum(int[][] arr) {
        boolean isOk = true;
        for (int i = 0; i < arr.length; i++) {
            int sum_1 = 0;
            int sum_2 = 0;

            for (int j = 0; j < arr.length; j++) {
                sum_1 += arr[i][j];
            }
            for (int j = 0; j < arr.length; j++) {
                sum_2 += arr[j][i];
            }
            if (sum_1 != sum_2) {
                isOk = false;
            }
        }
        return isOk;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 5}, {6, 7, 3}, {0, 8, 0}};

        System.out.println(sum_of_sum(matrix));

    }
}
