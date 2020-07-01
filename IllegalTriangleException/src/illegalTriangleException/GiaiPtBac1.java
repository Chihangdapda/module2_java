package illegalTriangleException;

import java.util.Scanner;

public class GiaiPtBac1 {

    public static void main(String[] args) throws IllegalPtBac1 {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap a:");
            int a = sc.nextInt();
            System.out.println("nhap b:");
            int b = sc.nextInt();
            if (a == 0 && b != 0){
                throw new IllegalPtBac1("long lon");
            }
        }catch(IllegalPtBac1 e) {
            System.out.println(e);
        }
        System.out.println("csd");

        }
       /* if (a == 0 && b != 0) {
            throw new IllegalPtBac1("nhap sai he so");
        }
        System.out.println(-b/a);*/
    }



