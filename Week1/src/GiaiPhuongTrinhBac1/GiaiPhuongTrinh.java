package GiaiPhuongTrinhBac1;

import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh");
        System.out.println("Cho phuong trinh dang a*x+b=0. Nhap cac gia tri a, b:");
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();

        if (a!=0){
            double x = -b/a;
            System.out.println("nghiem la: " + x);
        } else {
            if (b==0){
                System.out.println("phuong trinh co vo so nghiem");
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
        }

    }
}
