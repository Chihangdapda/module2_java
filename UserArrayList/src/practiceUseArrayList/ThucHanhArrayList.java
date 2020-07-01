package practiceUseArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThucHanhArrayList {
    public static void main(String[] args) {
        List<Student> strings = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        System.out.println("so luong sv can nhap ban dau:");
        int amountStudent = sc.nextInt();

        for (int i = 0; i < amountStudent; i++) {
            System.out.println("nhap ten sinh vien:");
            String name = sc.next();
            System.out.println("nhap tuoi sinh vien:");
            int age = sc.nextInt();
            System.out.println("nhap dia chi sinh vien:");
            String address = sc.next();
            Student students =new Student(name,age,address);
            strings.add(students);
        }

        while (true) {
            System.out.println("__________________________________");
            System.out.println("chon 1: de hien thi danh sach sv");
            System.out.println("chon 2: de nhap them sv");
            System.out.println("chon 3: de xoa sv");
            System.out.println("chon 0: de thoat chuong trinh");
            System.out.println("____________________________________");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    display(strings);
                    break;
                case 2:
                    /*if (strings.contains(enterStudent())) {
                        System.out.println("sinh vien da nhap");
                        break;
                    } else {*/
                        strings.add(enterStudent());
                        System.out.println("them sinh vien thanh cong");
                        break;
                   // }

                case 3:
                    /*if (strings.isEmpty()) {
                        System.out.println("khong co sinh vien");
                        break;
                    } else*/
                    System.out.println("nhap id sinh vien can xoa:");
                        strings.remove(strings.get(sc.nextInt()));
                    System.out.println("xoa sinh vien thanh cong");
                    break;

                case 0:
                    System.exit(0);

            }
        }
    }


    public static void display(List<Student> str) {
        for (Student s : str) {
            System.out.println("id" + str.indexOf(s)+" " + s + " ");
        }
    }

    public static Student enterStudent() {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap ten sinh vien:");
        String name = sc.next();
        System.out.println("nhap tuoi sinh vien:");
        int age = sc.nextInt();
        System.out.println("nhap dia chi sinh vien:");
        String address = sc.next();
        return new Student(name,age,address);
    }


}
