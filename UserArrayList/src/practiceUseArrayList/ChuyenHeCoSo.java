package practiceUseArrayList;

import java.util.Scanner;

public class ChuyenHeCoSo {
    public static void main(String[] args) {
        int n;
        int b;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap so nguyen duong n: ");
        n =sc.nextInt();
        System.out.println(n+" trong he nhi phan la: ");
        System.out.println(converNumber(n));
    }

    private static String converNumber(int n) {
        StringBuilder bynary = new StringBuilder();

        if (n<0){
            return "nhap sai";
        }
        while (n>0){
            bynary.append(n%2);
            n=n/2;
        }
        return bynary.reverse().toString();
    }
}
