package LinkedLists;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    
    //add - first,last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
         Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }
    // print
    public void printList(){
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }
    //deleteFirst
    public void deleteFirst(){
         if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        head = head.next;
        
       
    }
    //deleteLast
    public void deleteLast(){
         if(head == null) {
            System.out.println("List is empty.");
            return;
        }
         size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
    public int getSize(){
       return size;
    }
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

        //update
            prevNode = currNode;
            currNode = nextNode;
        }
        
        head.next = null;
        head = prevNode;
        
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addLast("is");
        list.addLast("list");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addLast("Ditiya");
        list.addLast("Shrestha");
        list.addFirst("Ritam");
        list.printList();
        list.reverseIterate();
        list.printList();
        list.reverseRecursive(null);
    }

}
