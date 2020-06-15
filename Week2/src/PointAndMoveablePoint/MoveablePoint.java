package PointAndMoveablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = getxSpeed();
        arr[1] = getySpeed();
        return arr;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] MovePoint() {
        float[] arr = new float[2];
        arr[0] = super.getX() + xSpeed;
        arr[1] = super.getY() + ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() + "speed= " + Arrays.toString(getSpeed()) + " movepoint= " + Arrays.toString(MovePoint());
    }
}

class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(3.4f, 3.4f);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(2.1f, 3.1f, 4.0f, 4.0f);
        System.out.println(moveablePoint);
    }
}