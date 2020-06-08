package KiemTraNamNhuan;

import java.util.Scanner;

public class KiemTraNam {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year: ");
        year = sc.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 ==0){
                    System.out.println("nam " + year + " la nam nhuan");
                }else{
                    System.out.println("nam " + year + " la nam khong nhuan");
                }
            } else {
                System.out.println("nam " +year + " la nam nhuan" );
            }
        } else {
            System.out.println("nam " + year + " la nam khong nhuan");
        }
    }
}
