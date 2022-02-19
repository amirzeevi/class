package exercises;

import java.util.Scanner;

/**
 * receives a number and increases each digit by 1
 */

public class func1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int res = increment(num);
        System.out.printf("The result is %d", res);
    }

    public static int increment(int num) {
        int numNew = 0;
        int multi = 1;

        while (num > 0) {
            numNew += (num % 10 + 1) % 10 * multi;
            multi *= 10;
            num /= 10;
        }
        return numNew;
    }

}
