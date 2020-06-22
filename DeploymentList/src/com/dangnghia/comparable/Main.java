package com.dangnghia.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1,"a"));
        list.add(new Person(5,"c"));
        list.add(new Person(3,"e"));
        list.add(new Person(2,"b"));
        list.add(new Person(6,"d"));

        System.out.println("truoc khi sap xep");
        for (Person p : list
             ) {
            System.out.println(p.getId());
        }
       /* System.out.println("sau khi sap xep");
        Collections.sort(list);
        for (Person p: list
             ) {
            System.out.println(p.getId());
        }
*/
        Collections.sort(list);
        for (Person p : list
             ) {
            System.out.println(p.getId()+p.getName());
        }

    }
}
