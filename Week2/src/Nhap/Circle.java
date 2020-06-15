package Nhap;

public class Circle extends Geometric {
   private double radius;

   public Circle(){
   }

   public Circle(double radius){
       this.radius = radius;
   }

   public Circle(double radius, String color,String filled){
       this.radius = radius;
       setColor(color);
       setFilled(filled);
   }

    public double getRadius(){
       return radius;
   }
   public void setRadius(double radius){
       this.radius = radius;
   }

   public double getArea(){
       return radius*radius*Math.PI;
   }
   public double getPerimete(){
       return 2*radius*Math.PI;
   }
   public double getDiamete(){
       return 2*radius;
   }

   public void printCicle(){
       System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
   }

}
