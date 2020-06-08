package SuDungToanTu;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);
        width = sc.nextFloat();
        height = sc.nextFloat();
        float area = width * height;
        System.out.println(area);
    }
}
