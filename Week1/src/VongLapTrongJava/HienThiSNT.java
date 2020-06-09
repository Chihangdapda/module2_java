package VongLapTrongJava;

import java.util.Scanner;

public class HienThiSNT {
    public static void main(String[] args) {

        int n;
        boolean status = false;
        int num = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        n = sc.nextInt();
        if (n >= 1) {
            System.out.println(n + " Số nguyên tố đầu tiên là:");
            System.out.println(2);
        } for (int i = 2; i <= n; ) {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        status = true;
                        break;
                    }
                }
                if (status != true) {
                    System.out.println(num);
                    i++;
                }
                status = false;
                num++;
            }
    }
}