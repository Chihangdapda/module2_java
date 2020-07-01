package practiceUseArrayList;

import java.util.Scanner;

public class UocSoBoiSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        int a = sc.nextInt();
        System.out.println("nhap b:");
        int b = sc.nextInt();
        System.out.println("USCLN cua "+ a + " va " + b +" la: "+ uscll(a,b));
        System.out.println("BSCNN cua "+ a +" va "+b+ " la: "+ bscnn(a,b));
    }

    private static int bscnn(int a, int b) {
        return (a*b)/uscll(a,b);
    }

    private static int uscll(int a, int b) {
        if (b==0){
            return a;
        } return uscll(b,a%b);
    }

}

