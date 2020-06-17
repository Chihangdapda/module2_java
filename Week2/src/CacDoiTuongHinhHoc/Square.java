package CacDoiTuongHinhHoc;

import InterfaceResizeable.InterfaceResizeable;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setHeight(side);
        super.setWidth(side);
    }


    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void resize(double percent) {
        super.setWidth(getSide());
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
class SquareTest{
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(2.0);
        System.out.println(square1);

        Square square2 = new Square(4.0,"yellow",true);
        System.out.println(square2);
    }
}