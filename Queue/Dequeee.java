package Queue;
import java.util.*;


//dequeue is a action of remove a element from queue
//deque is a double ended queue, an interface


public class Dequeee {
    public static void main(String[] args) {
        Deque<Integer> d= new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        System.out.println(d);
        d.addLast(3);
        System.out.println(d);
        //remove last
        //remove first
        //get last
        //get first for peek operations
    }
}
