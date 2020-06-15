package Nhap;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Geometric c1=  new Circle(1);
        c1.setFilled("black");
        System.out.println("A circle: " + c1.toString());
        System.out.println("The radius is: " + ((Circle) c1).getRadius());
        System.out.println("The Area is: "+ ((Circle) c1).getArea());
        System.out.println("The perimete is: " + ((Circle) c1).getPerimete());
        System.out.println("The Diamete is: " + ((Circle) c1).getDiamete());
        System.out.println();

        Rectangle r1 = new Rectangle(2.0,4.0);
        r1.setFilled("red");
        System.out.println("A Rectangle: "+r1.toString());
        System.out.println("The Width is: " + r1.getWidth());
        System.out.println("The Height is: " + r1.getHeight());
        System.out.println("The Area is: "+r1.getArea());
        System.out.println("The Perimete is: "+ r1.getPerimete());
    }
}
