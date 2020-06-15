package StaticMethod;

public class Car {
     String name;
     String engine;

    public Car() {
    }

    public static int numberOfCar;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }

    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCar = numberOfCar;
    }
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
    void display(){
        System.out.println("ten xe: "+getName()+"  ten dong co:"+getEngine());
    }
}
class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("cong nong","dau");
        System.out.print(Car.numberOfCar+":");
        car1.display();

        Car car2 = new Car("xe bo", "bo");
        System.out.print(Car.numberOfCar+":");
        car2.display();

        Car car3 = new Car("xe trau","trau");
        System.out.print(Car.numberOfCar+":");
        car3.display();

        Car car4 = new Car();
        car4.setName("tai");
        car4.setEngine("xang");
        System.out.print(Car.numberOfCar+":");
        car4.display();
    }
}
