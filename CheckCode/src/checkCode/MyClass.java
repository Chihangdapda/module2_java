package checkCode;

import java.util.Scanner;

public class MyClass {
    private String name;
    private int age;
    private int id;


    public void Myclass(){

    }
    public  MyClass (int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id:"+getId()+" Name:"+getName()+" Age:"+getAge();
    }
    
}
