package InterfaceComparable;

import CacDoiTuongHinhHoc.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (Circle.getRadius() > o.getRadius()) return 1;
        else if (Circle.getRadius() < o.getRadius()) return -1;
        else return 1;
    }

    @Override
    public int comparaTo(ComparableCircle o) {
        return 0;
    }
}