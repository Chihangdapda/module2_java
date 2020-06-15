package Point2Dand3D;

import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(){

    }

    public Point2D(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }


    public float[] getXY(){
        float [] arr = new float[2];
         arr[0]=x;
         arr[1]=y;
         return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY()) ;
    }
}

class TestPoint2D{
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,4);
        System.out.println(point2D);
    }
}