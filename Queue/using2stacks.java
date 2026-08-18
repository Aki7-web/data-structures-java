package Queue;
import java.util.*;

//queue using 2 stacks

public class using2stacks {
    public static class Queue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();

        //is empty
        public static boolean isEmpty(){//this is for queue only as it is determined by stack 1 only
            return s1.isEmpty();
        }

        //add with help of 2 stacks
        //add in stack 1 if its empty, if not transfer elements from1 to 2 then add in 1 then
        //transfer from 2 to 1 again, this way when u pop from 2, it comes out as if it were in queue

        //add fctn O(n)
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

         //remove O(1)
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        //peek O(1)
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
