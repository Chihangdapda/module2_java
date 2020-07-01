package binarySearchSetting;

import javax.management.StandardEmitterMBean;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchSetting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size;
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        selectionSort1(arr);
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }


        System.out.println(binarySeach(arr, 0, size-1, 20));
    }


    public static void selectionSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static int binarySeach(int[] arr, int low, int hight, int value) {
        if (hight >= low) {
            int mid = (low + hight) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySeach(arr, low, mid - 1, value);
            } else
                return binarySeach(arr, mid + 1, hight, value);
        } return -1;
    }

}
