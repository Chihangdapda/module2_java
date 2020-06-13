package oop;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return ((b * b) - 4 * a * c);
    }

    public double getRoot1() {
        return (double) (-b + (Math.sqrt(b * b - 4 * a * c)) / 2 * a);
    }

    public double getRoot2() {
        return (double) (-b - Math.sqrt(b * b - 4 * a * c) / 2 * a);
    }
    public double getRoot(){
        return -b/a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        System.out.println("nhap b: ");
        System.out.println("nhap c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println(quadraticEquation.getRoot());
        } else
            System.out.println("the Equation has not root");
    }
}
