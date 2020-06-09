package ArrayInJava;

public class FindMin {
    public static void findMin(int[] array) {
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i + 1;
            }
        }
        System.out.println("min la: " + min);
        System.out.println("vi tri:" + index);
    }

    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.println("mang vua nhap:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 9 + 1);
            System.out.print(a[i]);
        }
        System.out.println("");
        findMin(a);
    }
}
