package practiceUseArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=10;i<201;i++){
            if (i%7==0&&i%5!=0){
                list.add(i);
            }
        }
       int size = list.size();
        for (int i=0;i<size;i++){
            System.out.println(list.get(i) +" ");
        }

    }


}

