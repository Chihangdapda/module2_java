package queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue  queue = new MyLinkedListQueue();
        queue.enqueue(40);
        queue.enqueue(40);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(67);
        queue.enqueue(42);
        queue.enqueue(50);
        System.out.println(queue.size());
        Node Temp = queue.getHead();
        for (int i= 0;i<queue.size();i++){
            System.out.println("tao in:" + Temp.key);
            Temp = Temp.next;
        }

        /*System.out.println(queue.enqueue(40).key);
        System.out.println(queue.enqueue(40).key);*/
       /* System.out.println(queue.dequeue().key);
        System.out.println(queue.dequeue().key);*/
    }
}
