package com.dangnghia.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1,"a"));
        list.add(new Person(3,"d"));
        list.add(new Person(2,"e"));
        list.add(new Person(5,"b"));
        list.add(new Person(4,"b"));

        System.out.println("truoc khi sap xep");
        for (Person p :list
             ) {
            System.out.println(p.getId()+p.getName());
        }

       /* list.sort(((o1, o2) -> (o1.getId() - o2.getId())));
        for (Person p:list){
            System.out.println(p.getName());*/
        list.sort((o1, o2) -> (o1.getId() - o2.getId()));
        for (Person p:list){
            System.out.println(p.getId());
        }



       /* System.out.println("sau khi sap xep");
        Collections.sort(list,new MyCompare());*/


           /* @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId()>o2.getId()){
                    return 1;
                }else if(o1.getId()<o2.getId()){
                    return -1;
                }else
                return 0;
            }
        });*/
       /* for (Person p :list
        ) {
            System.out.println(p.getId()+p.getName());
        }*/
    }
}
class MyCompare implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
       if (o1.getId()>o2.getId()){
           return 1;
       }else if (o1.getId()<o2.getId()){
           return -1;
       }else return 0;
    }
}