package ArrayInJava;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1, size2;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang 1:");
        size1 = sc.nextInt();

        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 9 + 1);
            System.out.print(array1[i]);
        }

        System.out.println("");
        System.out.println("nhap so phan tu mang 2");
        size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 9 + 1);
            System.out.print(array2[i]);
        }
        System.out.println("");
        int[] array = new int[size1 + size2];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
            for (int j = 0; j < array1.length; j++) {
                array[j] = array1[j];
            }
            for (int j = 0; j < array2.length; j++) {
                array[size1 + j] = array2[j];
            }
            System.out.print(array[i]);
        }

    }}


