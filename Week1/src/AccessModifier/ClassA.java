package AccessModifier;

import Pack.A;

public class ClassA {
    int data=40;
    void msg(){
        System.out.println("Hello Java");
    }
}
class Simple extends A {
    public static void main(String[] args) {
        Simple obj = new Simple();
        obj.msg();

    }

}
