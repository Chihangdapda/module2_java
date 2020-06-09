package ArrayInJava;

import java.util.Scanner;

public class ThemPtMang {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang:");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9 + 1);
            System.out.print(array[i]);
        }
        System.out.println("");
        int x;
        System.out.println("nhap phan tu can chen vao mang:");
        x = sc.nextInt();
        int index;
        System.out.println("nhap vi tri can chen trong mang:");
        index = sc.nextInt();
        if (index < array.length - 1){
            for (int i = 0; i < array.length; i++) {
                array[index]=array[index+1];
                array[index] = x;
                System.out.print(array[i]);
            }

        }else
            System.out.println("vuot qua, khong chen dc");

    }
}
