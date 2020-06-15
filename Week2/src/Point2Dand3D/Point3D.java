package Point2Dand3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z =0.0f;
    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z){
        this.z = z;
    }

    private float[] getXYZ() {
       float[] arr = new float[3];
       arr[0] = super.getX();
       arr[1] = super.getY();
       arr[2] = z;
       return arr;

    }
    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }


}
class TestPoint3D{
    public static void main(String[] args) {
        Point3D point3D= new Point3D(4.0f, 2.0f,  6.5f);
        System.out.println(point3D);
    }
}