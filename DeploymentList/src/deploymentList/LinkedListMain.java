package deploymentList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        Person person = new Person(1,"Vinh");
        Person person1 = new Person(2,"Nam");
        Person person2 = new Person(3, "Linh");
        LinkedList<Person> list = new LinkedList<Person>();

        list.add(person);
        list.add(person1);
        list.add(person2);

        for (Person p:list
             ) {
            System.out.println(p.getId());
        }

        System.out.println("-------------");
        System.out.println( list.size());

        System.out.println("sau khi them -------------");
         list.addFirst(new Person(7,"Tuan"));

        for (Person p:list
        ) {
            System.out.println(p.getId());
        }
        System.out.println(list.getLast().getId());
        System.out.println(list.getLast().getName());

        list.remove(0);
        for (Person p:list
        ) {
            System.out.println(p.getId());
        }
        System.out.println( list.size());
        System.out.println("---------------------");
        list.hashCode();
        for (Person p:list
        ) {
            System.out.println(p.getId());
        }
    }
}
