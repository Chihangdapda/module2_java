package RectangleComparator;

import CacDoiTuongHinhHoc.Rectangle;

import java.util.Arrays;
import java.util.Comparator;

class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        if (r1.getArea() > r2.getArea()) {
            return 1;
        } else if (r2.getArea() > r1.getArea()) {
            return -1;
        } else return 0;
    }
}

class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(4, 2);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(5, 7, "red", true);
        System.out.println("pre-sorted");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);
        System.out.println("After-sorted");
        for (Rectangle rectangle: rectangles){
            System.out.println(rectangle);
        }

    }


}
