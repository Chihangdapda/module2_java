package VongLapTrongJava;

import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {

        int choice = -1;
        System.out.println("lua chon de ve:  ");
        System.out.println("1. ve hinh tam giac");
        System.out.println("2. ve hinh vuong");
        System.out.println("3. ve hinh tron");
        System.out.println("0. thoat khoi menu");

        while (choice != 0) {
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("tam giac");
                    break;
                case 2:
                    System.out.println("hinh vuong");
                    break;
                case 3:
                    System.out.println("hinh tron");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("chon lai");

            }
        }
    }
}
