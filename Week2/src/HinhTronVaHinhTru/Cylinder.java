package HinhTronVaHinhTru;

public class Cylinder extends Circle {
    private double height;
    public  Cylinder(){
    }

    public Cylinder(double radius,double height,String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return  this.height*super.getPerimete();
    }

    public double getV(){
        return this.height*super.getArea();
    }

    @Override
    public String toString() {
        return "chieu cao = "+getHeight()+" dien tich toan phan = "+ getArea() + " the tich="+ getV()+
                super.toString();
    }
}
class TestCylinder{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.0,4.0,"red");
        System.out.println(cylinder);

    }
}