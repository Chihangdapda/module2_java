package checkCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Main classManager = new Main();
        int choice = -1;
        MyClass myClass = new MyClass(1, "nam", 23);
        MyClass myClass1 = new MyClass(2, "trung", 24);
        MyClass myClass2 = new MyClass(3, "Tuan", 25);
        List<MyClass> myClasses = new ArrayList<>();
        myClasses.add(myClass);
        myClasses.add(myClass1);
        myClasses.add(myClass2);


        while (true) {
            System.out.println("------------------------------");
            System.out.println("1. Hien Thi Danh Sach");
            System.out.println("2. Them Vao Danh Sach");
            System.out.println("3. Xoa Danh Sach");
            System.out.println("0. Thoat khoi chuong trinh");
            System.out.println("------------------------------");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < myClasses.size(); i++) {
                        System.out.println(myClasses.get(i));
                    }
                    break;

                case 2:
                    int id;
                    do {
                        System.out.println("Enter id:");
                        id = sc.nextInt();
                    } while (classManager.isExistId(id));


                    System.out.println("Enter Name:");
                    String name = sc.next();
                    System.out.println("Enter age:");
                    int age = sc.nextInt();
                    MyClass myClassAdd = new MyClass(id, name, age);
                    myClasses.add(myClassAdd);
                    System.out.printf("them thanh cong sinh vine moi: ID: %d. Name: %s. Age: %d. \n", id, name, age);

                    break;

                case 3:
                    System.out.println("Enter id remove:");
                    int idRemove = sc.nextInt();
                    MyClass temp = myClasses.remove(idRemove);
                    System.out.printf("Xoa thanh cong sinh vine moi: ID: %d. Name: %s. Age: %d. \n",
                            temp.getId(), temp.getName(), temp.getAge());
                    break;
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
            }
        }
    }
}
