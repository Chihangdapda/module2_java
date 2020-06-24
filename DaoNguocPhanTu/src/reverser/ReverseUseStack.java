package reverser;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class ReverseUseStack {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        Stack<Integer> stack = new Stack<>();
        for (int i:arr
             ) {
            stack.push(i);
            System.out.print(i);
        }
        System.out.println("");

        for (int i=0;i<arr.length;i++){
            arr[i]=stack.pop();
            System.out.print(arr[i]);
        }
    }
}
