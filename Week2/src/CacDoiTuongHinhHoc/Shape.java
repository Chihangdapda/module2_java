package CacDoiTuongHinhHoc;

import InterfaceResizeable.InterfaceResizeable;

public class Shape {
     String color;
     boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String setColor() {
        return this.color;
    }

    public boolean setFilled() {
        return filled;
    }


    @Override
    public String toString() {
        return " A shape with color of "+ getColor()+ " and"+ (isFilled()?" filled":" notfilled");
    }

}
