package bubbleSort;

import javax.management.StandardEmitterMBean;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={9,6,2,3,6,5};
        /*int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.print(arr[i] + " ");
        }*/

      /*  System.out.println("\n---------------------");
        bubbleSort(arr);
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }*/
        /*System.out.println("\n---------------------");
        selectionSort(arr);
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }*/
        insertionSort(arr);
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean checkSort = true;
        for (int i = 1; i < arr.length; i++) {
            checkSort = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    checkSort = true;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            if (minIndex!=i){
                int temp = arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]= temp;
            }
        }
    }

    public static void  insertionSort(int [] arr){
        int temp;
        for (int i=1; i<arr.length;i++){
            temp = arr[i];
            for (int j=i-1;j>=0 && arr[j]>temp;j--){
                arr[j]=arr[j+1];
                arr[j]= temp;
            }
        }
    }
}
