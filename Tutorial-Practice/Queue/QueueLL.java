package Queue;

public class QueueLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        public static void enQueue(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                tail = head = newNode;
                return;
            } else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        public static int deQueue(){

            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;

            } else{
                int front = head.data;
                //for single node
                if(head == null){
                    tail = null;
                }
                head = head.next;
                return front;

            }


        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deQueue();
        }
    }

    
}

