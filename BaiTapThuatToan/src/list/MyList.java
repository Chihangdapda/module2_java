package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elemens[];


    public MyList() {
        elemens = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = elemens.length * 2;
        elemens = Arrays.copyOf(elemens, newSize);
    }

    public int getSize() {
        return size;
    }

    public void add(E e) {
        if (size == elemens.length) {
            ensureCapa();
        } else
            elemens[size++] = e;
    }

    public E get(int i) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException("index: " + i + "size: " + i);
        }
        return (E) elemens[i];
    }

}

class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> number = new MyList<Integer>();
        number.add(1);
        number.add(4);
        number.add(3);
        number.add(6);
        number.add(9);
        number.add(7);
        number.add(2);
        number.add(8);
        number.add(1);
        number.add(4);
        number.add(3);
        number.add(6);
        number.add(9);
        number.add(7);
        number.add(2);
        number.add(8);
        for (int i = 0; i < number.getSize(); i++) {
            System.out.println(number.get(i));
        }
    }
}