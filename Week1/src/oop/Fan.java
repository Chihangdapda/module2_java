package oop;

public class Fan {

    private boolean status;
    private int speed;
    private double radius;
    private String color;

    public Fan(boolean status, int speed, double radius, String color) {
        this.status = status;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.status) {
            return ("trang thai: fan is on, " + " toc do: " + getSpeed() +
                    ", ban kinh: " + getRadius() + ", color: " + getColor());
        }else
        return "fan is off";
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(true, 3, 10.0, "red");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(true, 2, 5.0, "blue");
        System.out.println(fan2.toString());
        Fan fan3 = new Fan(false, 2, 5.0, "blue");
        System.out.println(fan3.toString());

    }
}
