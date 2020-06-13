package VongLapTrongJava;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int choice = -1;
        System.out.println("1. In hinh chu nhat");
        System.out.println("2. In hinh tam giac(goc vuong tren");
        System.out.println("3. In hinh tam giac(goc vuong duoi");
        System.out.println("4. In hinh tam giac(goc vuong tren, phai");
        System.out.println("5. In hinh tam giac(goc vuong duoi, phai");
        System.out.println("6. In hinh tam giac can");
        System.out.println("0. Thoat khoi menu ");

        while (choice != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");

                    }
                    break;
                case 3:
                    for (int i = 5; i >= 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if ((i + j) >= 4) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < 5; j++) {
                            if ((i + j) >= 5) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 6:
                    for (int i = 0; i <= 10; i+=2) {
                        for (int j = 0; j <(i+1) ; j++) {
                                System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("nhap lai");


            }
        }
    }
}
