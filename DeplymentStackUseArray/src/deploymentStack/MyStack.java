package deploymentStack;

public class MyStack {
    int size;
    int [] arr;
    int index;

    public MyStack(){}

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public  boolean isFull(){
        if (index == size){
            return true;
        }return false;
    }

    public boolean isEmpty(){
        if (index==0){
            return true;
        } return false;
    }

    public int size(){
        return index;
    }

    public void push(int element){
        if (isFull()){
            throw new StackOverflowError();
        }
        arr[index] = element;
        index ++;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

}
