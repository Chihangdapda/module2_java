package practiceUseArrayList;

import java.util.Scanner;

public class TinhGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen duong n:");
        int n = sc.nextInt();
        System.out.println("giai thua cua n la: "+ tinhgt(n));
    }
    public static int tinhgt(int n){
        if (n>0){
            return n*tinhgt(n-1);
        }
        return 1;
    }
}

