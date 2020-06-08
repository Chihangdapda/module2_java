package VongLapTrongJava;

import java.util.Scanner;

public class HienThiSNT {
    public static void main(String[] args) {
        int slSNT;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong SNT can tim: ");
        slSNT = sc.nextInt();
        int count = 0;
        int n = 2;
        int i = 2;

        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {

            }
            i++;
        }

    }
}
