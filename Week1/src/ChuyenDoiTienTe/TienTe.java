package ChuyenDoiTienTe;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The usd:");
        float   usd = sc.nextFloat();
        float tienTe = usd*23000;
        System.out.println("gia tri vnd la: " + tienTe);
    }
}
