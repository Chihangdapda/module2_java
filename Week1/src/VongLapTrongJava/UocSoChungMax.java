package VongLapTrongJava;

import java.util.Scanner;

public class UocSoChungMax {
        public static void main(String[] args) {
            int a, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("first number: ");
            a = sc.nextInt();
            System.out.println("last number: ");
            b = sc.nextInt();
            a = Math.abs(a);
            b = Math.abs(b);

            if (a==0||b==0){
                System.out.println("khong co UCLN");
            };
            while (a!=b){
                if (a>b){
                    a = a -b;
                } else{
                    b = b-a;
                }
            }
            System.out.println("UCLN la: " + a);
        }
}