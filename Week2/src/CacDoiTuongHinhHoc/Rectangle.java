package CacDoiTuongHinhHoc;

import InterfaceResizeable.InterfaceResizeable;

public class Rectangle extends Shape implements InterfaceResizeable {
    private double width;
    private double height;

    public Rectangle() {
    }
    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    public Rectangle(double width,double height, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+getWidth()+" and height= "+getHeight()+
                " The Area ="+getArea()+", wich is subclass of "+
                super.toString();
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth()*percent/100);
        setHeight(getHeight()*percent/100);
    }
}
class RectangleTest{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(2.0,4.0);
        System.out.println(rectangle1);

        Rectangle rectangle2 =new Rectangle(4.0,6.0,"red",true);
        System.out.println(rectangle2);
    }
}