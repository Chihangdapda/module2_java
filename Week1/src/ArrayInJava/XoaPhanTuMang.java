package ArrayInJava;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9 + 1);
            System.out.print(array[i]);
        }
        System.out.println("");
        int x;
        int index;
        System.out.println("nhap phan tu can xoa:");
        x = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                array[i] = array[i + 1];
            }else if (array[array.length-1] == x){
                array[array.length -1] =0;
            }

            System.out.print(array[i]);
        }
    }
}
