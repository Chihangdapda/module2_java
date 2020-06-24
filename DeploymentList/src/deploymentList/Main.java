package deploymentList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1,"Vinh");
        Person person1 = new Person(2,"Nam");
        Person person2 = new Person(3, "Linh");

        List<Person>listPerson = new ArrayList<>();

        listPerson.add(person);
        listPerson.add(person1);
        listPerson.add(person2);


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
    listPerson.remove(person1);
        for (Person p : listPerson
             ) {
            System.out.println(p.getId());
        }
    }

}
