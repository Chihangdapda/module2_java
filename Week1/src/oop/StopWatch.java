package oop;

import SystemTime.SystemTime;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    long startTime, stopTime;

    private StopWatch(long startTime, long stopTime) {
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public StopWatch() {

    }

    public long getStar() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long getStop() {
        this.stopTime = System.currentTimeMillis();
        return this.stopTime;
    }

    public long getElapsedTime() {
        return this.stopTime - this.startTime;
    }


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int min = arr[index];
            arr[index] = arr[i];
            arr[i] = min;
        }
    }


    public static void main(String[] args) {
        int[] arr1 = new int[100000];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = (int) (Math.random()*99999 + 10);

    StopWatch stopWatch = new StopWatch();
        System.out.println("star Time: " + stopWatch.getStar());
        selectionSort(arr1);
        System.out.println("star Time: " + stopWatch.getStop());
        System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
    }
}





/* public static void main(String[] args) {
 *//*int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. choice start Time:");
        System.out.println("2. choice stop Time: ");
        System.out.println("3. choice display Elapsed Time : ");
        System.out.println("0. Exit");
        StopWatch stopWatch = new StopWatch();
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("star Time: " + stopWatch.getStar());
                    break;
                case 2:
                    System.out.println("stop Time:" + stopWatch.getStop());
                    break;
                case 3:
                    System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("chon sai");
            }

        } while (choice != 0);
    }*//*
}*/