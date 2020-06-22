package CacDoiTuongHinhHoc;

import InterfaceComparable.ComparableCircle;
import InterfaceResizeable.InterfaceResizeable;

public class Circle extends Shape implements InterfaceResizeable {
    private double radius;

    public Circle(){
    }
    public Circle(double radius){
        this.radius =radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimete(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "+ "area ="+getArea()
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*percent/100);
    }


}

class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(2.0);
        System.out.println(circle1);

        Circle circle2=new Circle(2.0,"white",true);
    }
}