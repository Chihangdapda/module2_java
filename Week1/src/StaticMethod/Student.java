package StaticMethod;

public class Student {
    static String classroom;
    String lastName;
    String firstName;
    int age;
    String gender;


    public Student(String lastName, String firstName, int age, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
    }

    static void change() {
        classroom = "c0420i1";
    }

    void display() {

        System.out.println("classrooom: " + classroom + "  Name:" + firstName + " " + lastName + "  age:" + age + "  gender:" + gender);
    }


    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student("dang", "nghia", 30, "male");
        Student s2 = new Student("tran", "sin", 28, "male");
        Student s3 = new Student("nguyen", "cosin", 29, "female");

        s1.display();
        s2.display();
        s3.display();

    }
}
