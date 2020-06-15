package StaticMethod;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle(){
    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color=color;
    }

    public double getRadius(){
        return radius;
    }


    public double getArea() {
        return radius*radius*3.14;
    }

    public String getColor(){
        return color;
    }

}
class TestCircle{
    public static void main(String[] args) {
        Circle circle= new Circle();

        System.out.println(circle.getRadius()+" "+circle.getArea()+" "+circle.getColor());
    }
}
