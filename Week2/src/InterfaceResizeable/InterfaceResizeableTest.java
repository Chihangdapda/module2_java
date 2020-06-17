package InterfaceResizeable;

import CacDoiTuongHinhHoc.Circle;
import CacDoiTuongHinhHoc.Rectangle;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "red", true);
        System.out.println(circle);
        circle.resize(150);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(30, 30);
        System.out.println(rectangle);
        rectangle.resize(150);
        System.out.println(rectangle);
    }
}
