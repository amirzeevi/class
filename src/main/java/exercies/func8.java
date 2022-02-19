package exercies;

public class func8 {
    public static int[] add(int[] arr1, int[] arr2) {
        int num1 = 0;
        int num2 = 0;

        for (int i : arr1) {
            num1 = num1 * 10 + i;
        }
        for (int j : arr2) {
            num2 = num2 * 10 + j;
        }

        int sum = num1 + num2;
        int temp = sum;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] res = new int[count];
        int i = res.length - 1;
        while (sum > 0) {
            res[i] = sum % 10;
            i -= 1;
            sum /= 10;
    }
        return res;
}

    public static void main(String[] args) {
        int[] num1 = {9, 9, 9, 9};
        int[] num2 = {9, 7};
        int[] res = add(num1, num2);
        for (int i : res) {
            System.out.print(i);
        }
    }
}
