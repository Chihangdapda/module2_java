package ArrayInJava;

import java.util.Scanner;

public class daonguoc2 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang:");
        size = sc.nextInt();

        int []arr = new int[size];
        System.out.println("arr truoc khi dao nguoc:");
        for (int i=0;i<size;i++){
            arr[i]= (int)(Math.random()*9+1);
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
        System.out.println("arr sau khi dao nguoc:");
        for (int i =arr.length-1;i>=0;i--){

            System.out.print(arr[i]+" ");
        }
    }
}
