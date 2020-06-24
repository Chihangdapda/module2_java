package deploymentStackUserArray;

public class StackClient {
    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(4);

        System.out.println("1. Size of stack after push operation: " + stack.size());
        System.out.println("2. Pop element from stack: ");

        while (!stack.isEmpty()){
            System.out.printf("%d",stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operation: " + stack.size());
    }
}
