package exercises;

public class func4 {
    public static int sum_digit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int arr(int[] arr) {
        int count = 0;
        for (int i : arr) {
            int res = sum_digit(i);
            if (res == 10) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {55, 44, 73, 10, 91, 64, 44};
        int res = arr(numbers);
        System.out.println(res);
    }
}
