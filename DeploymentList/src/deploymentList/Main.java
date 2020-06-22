package deploymentList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);

        List<Person>listPerson = new ArrayList<>();

        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p3);

       /* Person p = listPerson.get(2);
        System.out.println(p.getId());
*/
      /*  for (Person person:listPerson
             ) {
            System.out.println(person.getId());
        }

        for (int i =0;i<listPerson.size();i++){
            System.out.println(listPerson.get(i).getId());
        }*/
    listPerson.remove(p1);
        for (Person person : listPerson
             ) {
            System.out.println(person.getId());
        }
    }

}
