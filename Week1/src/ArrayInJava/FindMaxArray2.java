package ArrayInJava;

import java.util.Scanner;

public class FindMaxArray2 {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap  so cot:");
        row = sc.nextInt();
        System.out.println("nhap so hang:");
        col = sc.nextInt();
        int[][] array = new int[row][col];

        for (int i=0;i<row;i++){
            for (int j = 0; j<col;j++){
                array[i][j]=(int)(Math.random()*99 +1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        int max = array[0][0];
        for(int i = 0;i<row;i++){
            for (int j=0;j<col;j++){
                if (array[i][j]>max){
                    max = array[i][j];
                }
            }

        } System.out.println("max la:" + max);

    }
}
