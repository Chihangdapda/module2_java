package VongLapTrongJava;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien gui(trieu dong): ");
        double tiengui = sc.nextDouble();
        System.out.println("nhap so thang gui: ");
        double thang = sc.nextDouble();
        System.out.println("nhap ti le lai suat/nam: ");
        double laisuat = sc.nextDouble();
        double tongtien = 0;

        for (int i = 0 ; i < thang; i++){
            tongtien = tiengui + laisuat * i / 12;
        }
        System.out.println("tong tien nhan duoc: " + tongtien);
    }
}
