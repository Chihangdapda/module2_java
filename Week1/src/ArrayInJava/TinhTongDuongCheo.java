package ArrayInJava;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang:");
        row = sc.nextInt();
        System.out.println("nhap so cot");
        col = sc.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = (int) (Math.random() * 99 + 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    total += array[i][j];
                }
            }
        }
        System.out.println("tong duong cheo chinh la: " + total);
    }
}
