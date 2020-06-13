package oop;

import java.util.Scanner;

public class Rectangle {
    double width,height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double Perimeter(){
        return (width + height)*2;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width:");
        double width = sc.nextDouble();
        System.out.println("Enter Height:");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("dien tich: " + rectangle.getArea());
        System.out.println("chu vi: "+ rectangle.Perimeter());

        Rectangle rectangle2 = new Rectangle(width,height);

        rectangle.setWidth(sc.nextDouble());
        rectangle.setHeight(sc.nextDouble());
        System.out.println("dien tich: " + rectangle.getArea());
        System.out.println("chu vi: "+ rectangle.Perimeter());
    }
}
