package selectionSort;


public class SelectionSort {
    static double[] list = {1.2, 3.0, 4.2, 2.1, -1.8};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    index = j;
                }
            }
            if (index != i) {
                list[index] = list[i];
                list[i] = min;
            }
        }
    }

    public static void insertionSort(double[] list) {
        for (int i=1;i<list.length;i++){
            double currentElement = list[i];
            int k;
            for ( k=i-1;k>0&&list[k]>currentElement;k--){
                list[k+1]=list[k];
            }
            list[k+1]=currentElement;
        }
    }

    public static void bubbleSort(double[]list){
        boolean checkSort=false;
        for (int i =1;i<list.length&&checkSort;i++){
            for (int j=i+1;j<list.length-1;j++){
                if (list[j+1]>list[j]){
                    swap(list,i,j);
                    checkSort = true;
                }
            }
        }
    }

    private static void swap(double[] list, int i, int j) {
        double temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println("\n================selectionSort========================");
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n================InsretionSort========================");

        insertionSort(list);
        for (int i = 0; i<list.length;i++){
            System.out.print(list[i]+ " ");
        }

        System.out.println("\n==================BubbleSort=========================");
        bubbleSort(list);
        for (int i= 0 ; i<list.length;i++){
            System.out.print(list[i] + " ");
        }
    }
}
