package ArrayInJava;

import java.util.Scanner;

public class TotalInColumns {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang:");
        row = sc.nextInt();
        System.out.println("nhap so cot:");
        col = sc.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = (int) (Math.random() * 99 + 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        int choice;
        do {
            System.out.println("nhap cot can tinh tong:");
            choice = sc.nextInt();
        } while (choice >= row);

        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            }
            total += array[i][choice];
        }
        System.out.println("tong cot " + choice + " la: " + total);
    }
}
