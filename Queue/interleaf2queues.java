package Queue;
import java.util.*;

//both space and time complexity O(n)

public class interleaf2queues {

    public static void interleaf(Queue<Integer> q){
        Queue<Integer> first= new LinkedList<>();
        int size= q.size();
        while(q.size()>size/2){
            first.add(q.remove());
        }

        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleaf(q);
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
