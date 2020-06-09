package ArrayInJava;

import java.util.Scanner;

public class TemperatureConversion {
    public static double doCSangDoF(double doC){
        double doF=(9.0/5)*doC+32;
        return doF;
    }
    public static double doFSangdoC(double doF){
        double doC = (5.0/9)*(doF - 32);
        return doC;
    }

    public static void main(String[] args) {
        int choice=-1;
        double doF;
        double doC;
        System.out.println("1. Chuyen doi F sang C:");
        System.out.println("2. Chuyen doi C sang F:");
        System.out.println("0. Chon de thoat");

        while (choice!=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("lua chon chuyen doi:");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhap do F de chuyen doi:");
                    doF=sc.nextDouble();
                    System.out.println("ket qua chuyen doi sang do C: " + doFSangdoC(doF));
                    break;
                case 2:
                    System.out.println("nhap do C de chuyen doi:");
                    doC = sc.nextDouble();
                    System.out.println("ket qua chuyen doi sang do F: " + doCSangDoF(doC));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("nhap sai");
            }

        }
    }
}
