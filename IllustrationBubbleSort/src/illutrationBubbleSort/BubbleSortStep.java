package illutrationBubbleSort;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BubbleSortStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = sc.nextInt();
        int [] list = new int[size];
        /*System.out.println("Enter "+list.length+ " value:");*/
        for (int i=0;i<list.length;i++){
            list[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("input list");
        for (int i:list){
            System.out.print(i+" ");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
        for (int i = 0;i<list.length;i++){
            System.out.print(list[i] + " ");
        }
    }

    /*public static void swap(int[]list,int i, int j){
        int temp = list[i];
        list[i]=list[j];
        list[j]=temp;
    }*/

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }

            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + " sort: ");
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}


