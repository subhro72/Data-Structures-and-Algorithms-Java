package Queue;
// Array 
public class QueueArray {
    static class QueueA{
        static int arr[];
        static int size;
        static int rear;

        QueueA(int n){
            this.size = n;
            arr = new int[size];
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static boolean isFull(){
            return rear== size-1;
        }
        public static void enQueue(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = data;
        }
        public static int deQueue(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;

            }
            int front = arr[0];
            for(int i=0; i<rear ; i++){
                arr[i] = arr[i+1];

            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }
        public void printArray(){
            if(isEmpty()){
                return;
            }
            for(int i=0; i<=rear; i++){
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        QueueA q = new QueueA(5);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        System.out.println(q.peek());
        System.out.println(q.deQueue());
        System.out.println(q.peek());
        q.printArray();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deQueue();
        }

    }
    
}
