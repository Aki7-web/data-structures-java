package Queue;
import java.util.*;
//queue is a interface not claass so object is not directly made, it is made thorugh LinkedList class or ArrayDequeue class

public class JCFQueue {
    public static void main(String[] args) {
        //Queue<Integer> q= new Queue<>(); is wrong
        //Queue<Integer> q= new LinkedList<>();
         Queue<Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();

        while (!q.isEmpty() ) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
