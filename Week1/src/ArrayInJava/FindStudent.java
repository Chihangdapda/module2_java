package ArrayInJava;

import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {

        String [] array = {"A","B","C","D","E","F","G","H","K","L"};
        Scanner sc = new Scanner(System.in);
        String name;

            System.out.println("nhap ten: ");
            name = sc.nextLine();
            boolean startus = false;

            for (int i=0; i<array.length;i++){
                if (name.equals(array[i])){
                    startus=true;
                    break;
                }
            }
            if (startus){
                System.out.println(name);
            }else
                System.out.println("nhap sai, nhap lai:");


    }
}
