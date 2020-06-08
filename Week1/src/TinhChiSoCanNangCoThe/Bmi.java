package TinhChiSoCanNangCoThe;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight(in kilogram): ");
        double Weigh = sc.nextDouble();
        System.out.println("Enter Height(in meter): ");
        double Height = sc.nextDouble();
        double BMI=Weigh/(Height*Height);

        if (BMI<18){
            System.out.println(BMI + " Underweight");
        }else if(BMI<25){
            System.out.println(BMI + " Nomal");
        }else if (BMI<30){
            System.out.println(BMI + " Overweight");
        } else
            System.out.println(BMI + " Obese");

    }
}
