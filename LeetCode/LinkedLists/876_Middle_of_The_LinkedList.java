class Solution {
    public ListNode middleNode(ListNode head) { 
        ListNode hare = head;
        ListNode tortoise = head;
        if(head == null || head.next == null){
            return-1;
        }

        while(hare != null || hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            
        }
        return tortoise;
       
        
    }