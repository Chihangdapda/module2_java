package CircleComparator;

import CacDoiTuongHinhHoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComporator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        if(c1.getRadius()>c2.getRadius()){
            return 1;
        } else if (c1.getRadius()<c2.getRadius()){
            return -1;
        } else
            return 0;
    }
}

class CircleComparatorTest{
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0]=new Circle(3.6);
        circles[1]=new Circle();
        circles[2] = new Circle(3.5,"indigo",false);
        System.out.println("pre-sorted");
        for (Circle circle: circles){
            System.out.println(circle);
        }

        CircleComporator circleComporator = new CircleComporator();
        Arrays.sort(circles,circleComporator);

        System.out.println("After-sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}