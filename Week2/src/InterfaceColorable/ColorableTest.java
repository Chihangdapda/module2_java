package InterfaceColorable;

import CacDoiTuongHinhHoc.Circle;
import CacDoiTuongHinhHoc.Rectangle;
import CacDoiTuongHinhHoc.Shape;
import CacDoiTuongHinhHoc.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3, "red", true);
        shapes[1] = new Rectangle(4, 6, "black", true);
        shapes[2] = new Square(5, "white", true);
        shapes[3] = new Rectangle(6,6,"red",true);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable){
                Colorable colorable = (Square)shape ;
                System.out.println(colorable.howToColor());

            }
        }
    }
}
