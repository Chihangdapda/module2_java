package VdCaiDeNapChong;

public class CaiDeNapChong {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}

class A extends B {
    public void p(double number) {
        System.out.println(number);
    }
}

class B {
    public void p(double number) {
        System.out.println(number * 2);
    }
}
/*class Test {
    public static void main(String[] args) {
        C c = new C();
        c.p(10);
        c.p(10.0);
    }
}

class C extends D {
    public void p(int number) {
        System.out.println(number);
    }
}

class D {
    public void p(double number) {
        System.out.println(number * 2);
    }
}*/

