package queue;

import java.time.temporal.Temporal;
import java.util.LinkedList;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
private int size = 0;


    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;

    }
    public Node getHead(){
        return head;
    }

    public Node enqueue(int key){
        Node Temp = new Node(key);
        if (this.tail == null){
            this.head = this.tail = Temp;
            size++;
            return Temp;

        }
        this.tail.next=Temp;
        this.tail=Temp;
        size++;
        return Temp;
    }
public int size(){
        return size;
}
    public Node dequeue(){
        if (this.head == null)
            return null;
        Node Temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail=null;
        size--;
        return Temp;
    }



}
