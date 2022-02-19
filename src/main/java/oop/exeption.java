package oop;

import java.nio.file.LinkPermission;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class exeption {
    public static int[] fillArr(int size) {
        int[] arr = new int[size];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index;
            System.out.print(arr[index] + " ");
        }
        return arr;
    }

    public static boolean isBigger(int[] arr) {
        boolean isBigger = true;
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < arr[index - 1]) {
                isBigger = false;
                break;
            }
        }
        return isBigger;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = fillArr(size);
        System.out.println(isBigger(arr));
    }
}

