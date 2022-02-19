package exercies;

public class func3 {
    public static boolean mispar_mesu(int num) {
        boolean isOk = true;
        int sum = 0;
        for (int counter = 1; counter < num; counter++) {
            if (num % counter == 0) {
                sum += counter;
            }
        }
        if (sum != num) {
            isOk = false;
        }
        return isOk;
    }

    public static void main(String[] args) {
        for (int counter = 1; counter <= 10000; counter++) {
            boolean res = mispar_mesu(counter);
            if (res) {
                System.out.println(counter);
            }
        }
    }
}
