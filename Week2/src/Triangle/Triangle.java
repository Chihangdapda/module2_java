package Triangle;

import CacDoiTuongHinhHoc.Shape;//ten package tieng viet

public class Triangle extends Shape {
    double side1 = 1.0;
    double side2 = 1.0;
    double size3 = 1.0;//dat ten bien sai lam

    public Triangle() {
    }

    public Triangle(double side1, double side2, double size3) {
        this.side1 = side1;
        this.side2 = side2;
        this.size3 = size3;
    }

    public Triangle(double side1, double side2, double size3,String color,boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.size3 = size3;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getArea() {
        double p = getPerimete() / 2;//tach bien
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - size3));
        //tach bien area =Math.sqrt(p * (p - side1) * (p - side2) * (p - size3))
    }

    public double getPerimete() {//ten bien k co y nghia
        return (side1 + side2 + size3);// tach bien Perimeter = (side1 + side2 + size3), k can ngoac"()"
    }

    @Override
    public String toString() {

        return "side1= " + getSide1() + " side2: " + getSide2() +
                " side3: " + getSize3() + " Area: " + getArea() + " Perimete: " + getPerimete() +
                super.toString();
    }//co the tach bien
}

class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle =new Triangle(2.0,2.0,2.0);
        System.out.println(triangle);
        triangle = new Triangle(3.0,3.0,3.0,"black",true);
        System.out.println(triangle);
    }
}