package reverser;


import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();

        String str = "may o tren troi mua";

        String[] reverseStr = str.split(" ");
        for (String s : reverseStr) {
            strings.push(s);
        }
        System.out.println(Arrays.toString(reverseStr));

        for (int i = 0; i < reverseStr.length; i++) {
            reverseStr[i] = strings.pop();
        }

        System.out.println("");
        System.out.println(Arrays.toString(reverseStr));


    }
}
