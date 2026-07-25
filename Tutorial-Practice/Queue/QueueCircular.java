package Queue;

public class QueueCircular {
    static class CircularQ{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        CircularQ(int size){
            arr = new int[size];
            this.size = size;  
            rear = front = -1; 
        }
        public static boolean isEmpty(){
            return rear== -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void enQueue(int data){
            if(isFull()){
                System.out.println("Queue is full.");
                return;
            }
            //for first element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int deQueue(){
            if(isEmpty()){
                System.out.println("Empty Queue.");
                return -1;
            }
            int result = arr[front];    
            //if 1 element present only
            if(rear == front){
                rear = front = -1;
            }

            else{
            //last element delete
            front = (front+1)%size;
            }
            return result;


        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }

     
    }

    public static void main(String[] args){
        CircularQ q = new CircularQ(10);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        
        System.out.println(q.deQueue());
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deQueue();
        }
    }

    
}
