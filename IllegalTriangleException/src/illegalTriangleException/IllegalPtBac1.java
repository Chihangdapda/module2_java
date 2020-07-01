package illegalTriangleException;

import java.util.Scanner;

public class IllegalPtBac1 extends  Exception{
    String s;

    public IllegalPtBac1(String message) {
        super(message);
        this.s = s;
    }
}
