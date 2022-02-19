package exercies;

import java.util.Scanner;

public class jojo {
    static int pointer = 0;

    public static int[] initializeArr(int ARR_SIZE) {
        int[] arr = new int[ARR_SIZE];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = (int) (Math.random() * 10);
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int getMaxNum(int[] arr1, int count) {
        int maxNum = 0;
        int num;
        for (int index = 0; index <= arr1.length - count; index++) {
            num = 0;
            for (int j = index; j < index + count; j++) {
                num = num * 10 + arr1[j];
            }
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    public static void distinct(int[] arr1, int[] arr2, int[] arr3) {
        boolean isThere;
        boolean isExist = false;
        for (int i = 0; i < arr1.length; i++) {
            isThere = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isThere = true;
                    break;
                }
            }
            if (!isThere) {
                for (int k = 0; k < arr3.length; k++) {
                    isExist = false;
                    if (arr1[i] == arr3[k]) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    arr3[pointer] = arr1[i];
                    pointer++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ARR_SIZE = 15;
        int count;
        int maxNum;
        int[] arr1 = initializeArr(ARR_SIZE);
        int[] arr2 = initializeArr(ARR_SIZE);

        int[] arr3 = new int[ARR_SIZE];
        for (int index = 0; index < arr3.length; index++) {
            arr3[index] = -1;
        }
        distinct(arr1, arr2, arr3);
        distinct(arr2, arr1, arr3);
        printArr(arr1);
        printArr(arr2);

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (arr3[i] != -1) {
                System.out.print(arr3[i]+" ");
            }
        }
        System.out.println("Please enter number");
        count = input.nextInt();
        maxNum =

                getMaxNum(arr1, count);
        System.out.println(maxNum);
    }
}
