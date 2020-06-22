package com.dangnghia.student;

import com.dangnghia.comparable.Main2;
import com.dangnghia.comparator.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        list.add(new Student(10, "Nam"));
        list.add(new Student(20, "Linh"));
        list.add(new Student(20,"An"));
        list.add(new Student(10,"Nung"));

        Collections.sort(list,new Main2());
        for (Student s:list
             ) {
            System.out.println(s.getAge()+s.getName());
        }

      /*  Collections.sort(list, Comparator.comparing(Student::getAge).thenComparing(Student::getName));
        list.stream().map(x->x.getName()).forEach(System.out::println);*/
    }


}

