package practiceUseArrayList;

import java.util.Scanner;

public class PtBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        float a =sc.nextFloat();
        System.out.println("nhap b:");
        float b =sc.nextFloat();
        System.out.println("nhap c");
        float c =sc.nextFloat();

        if (a==0){
            if (b==0){
                System.out.println("phuong trinh vo nghiem");
            }else {
                float x = -c/b;
                System.out.println("phuong trinh co nghiem duy nhat la:");
            }
        }else {
            float delta = b*b-4*a*c;
            float x1;
            float x2;
            if (delta>0){
                x1= (float) ((-b + Math.sqrt(delta))/2*a);
                System.out.println("phuong trinh co nghiex x1:" + x1);
                x2 = (float) (-b - Math.sqrt(delta))/2*a;

                System.out.println("phuong trinh co nghiex x2:" + x2);
            } else if (delta==0){
                x1 = x2 =(float) -b/2*a;
                System.out.println("phuong trinh co nghiem kep x:" + x1);


            }else
                System.out.println("phuong trinh vo nghiem");
        }
    }
}
