package exercises;

import java.util.Scanner;

/**
 * receives two positive numbers. if they are different in length the function will return -1.
 * else the function will return a number that has the lowest digit of each numbers.
 */

public class func2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int res = lowest_numbers(num1, num2);
        System.out.println(res);
    }

    public static int lowest_numbers(int num1, int num2) {
        int temp1 = num1;
        int temp2 = num2;
        int count1 = 0;
        int count2 = 0;
        int new_num = 0;
        boolean isOk = true;

        while (temp1 > 0) {
            count1++;
            temp1 /= 10;
        }
        while (temp2 > 0) {
            count2++;
            temp2 /= 10;
        }
        if (count1 != count2) {
            isOk = false;
        } else {
            int multi = 1;
            while (num1 > 0) {
                if (num1 % 10 < num2 % 10) {
                    new_num = new_num + num1 % 10 * multi;
                } else {
                    new_num = new_num + num2 % 10 * multi;
                }
                multi *= 10;
                num1 /= 10;
                num2 /= 10;
            }
        }
        return isOk ? new_num : -1;
    }
}
