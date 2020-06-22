package TinhSoNgayTrongThang;

import java.util.Scanner;

public class TheDayInMonth {
    public static void main(String[] args) {
        int Month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month:");
        Month = sc.nextInt();
        switch (Month){
            case 2:
                System.out.println("thang " + Month + " co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("thang " + Month + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang " + Month + " co 30 ngay");
                break;
            default:
                System.out.println("nhap khong chinh xac");
        }
    }
}
