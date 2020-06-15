package PointAndMoveablePoint;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    @Override
    public String toString() {
        return "First Point:" + Arrays.toString(getXY());
    }
}
class PointTest{
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(1.3f,4.2f);
        System.out.println(point);
    }
}