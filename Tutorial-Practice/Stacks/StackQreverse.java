package Stacks;
import java.util.Stack;

public class StackQreverse {
     public static void pushAtBottom(int data, Stack<Integer> s){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
   public static void StackReverse(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }
            int top = s.pop();  
            StackReverse(s);
            pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i = 1;i<=5;i++){
            s.push(i);
        }
       StackReverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
