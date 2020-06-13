package ArrayInJava;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {


        int size;
        int[] arr;
        String[]str;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter arr size:");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        str = new String[size];
        arr = new int[size];

        int k =0;
        while (k < size) {
            System.out.println("Enter a name for student: "+ (k + 1) + ": ");
            str[k]=sc.next();
            System.out.print("Enter a mark for student " + (k + 1) + ": ");
            arr[k] = sc.nextInt();
            k++;
        }

        int cout =0;
        String nameStudent = "";
        int diemStudent =0;
        for (int j = 0;j<arr.length;j++){
            System.out.println("ten: " + str[j] +"  diem:"+ arr[j]+ "\t");
            if (arr[j]>5&& arr[j]<10){
                nameStudent += "ten:" +str[j] +" " + "diem:"+ arr[j] + "  ";

                cout++;
            }
        }
        System.out.println("the name of student passing the exam is:"+ nameStudent );
        System.out.println("\n The number of student passing the exam is: " +cout);

    }
}
