package ArrayInJava;

import java.util.Scanner;

public class DaoNguocPt {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc mang: ");
        size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu thu: " + i);
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        } System.out.println("\n");
        for (int i=0;i<array.length/2;i++){
            int temp = array[i];
            array[i] = temp;
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = temp;
        }
        System.out.printf("%-15s%s", "Reverse array: ", "");
        for (int j =0;j<array.length;j++){
            System.out.print(array[j]);
        }
    }
}
