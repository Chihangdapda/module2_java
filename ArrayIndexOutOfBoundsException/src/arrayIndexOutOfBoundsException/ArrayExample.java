package arrayIndexOutOfBoundsException;

import java.util.Scanner;

public class ArrayExample {
    public  int[] newRandom(){
        int [] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random() * 100) +1;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int [] arr = arrayExample.newRandom();
        Scanner sc =new Scanner(System.in);
        int index = sc.nextInt();

        try{
            System.out.println("gia tri phan tu " + index+ " la " + arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("vuot qua so luong phan tu mang");
        }
    }

}
