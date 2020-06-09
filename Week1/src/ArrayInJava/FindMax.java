package ArrayInJava;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap so phan tu:");
            size = sc.nextInt();
        } while (size > 20);
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu:" + i);
            array[i] = sc.nextDouble();
        }
        for (double i : array) {
            System.out.print(i + " ");
        }
        double max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }

        }
        System.out.print("max = " + max + "  ");
        System.out.print("vi tri:  " + index);
    }
}
