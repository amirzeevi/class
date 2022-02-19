package exercies;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class func1 {
    public static int adv(int num) {
        int newNum = 0;
        int multi = 1;

        while (num > 0) {
            newNum += (num % 10 + 1) % 10 * multi;
            multi *= 10;
            num /= 10;
        }
        return newNum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int res = adv(num);
        System.out.printf("The result is %d", res);
    }

}
