package exercies;

public class func7 {
    public static boolean mirror(int[][] arr) {
        boolean isOk = true;
        for (int i = 0; i < arr[0].length / 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] != arr[j][(arr[0].length - 1) - i]) {
                    isOk = false;
                    break;
                }
            }
        }
        return isOk;
    }

    public static void main(String[] args) {
        int[][] numbers = {{2,1,5,5,1,2},{6,7,3,3,7,6},{0,8,7,7,8,0}};

        boolean res = mirror(numbers);
        System.out.println(res);
    }
}
