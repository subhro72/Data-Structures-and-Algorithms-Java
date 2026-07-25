package Stacks;
import java.util.Stack;

public class StackCollectionFrameWork {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i = 1;i<=50;i++){
            s.push(i);
        }
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
