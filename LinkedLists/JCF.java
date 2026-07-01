package LinkedLists;
import java.util.LinkedList;

public class JCF {
    public static void main(String args[]){
        //create - objects from the class
        LinkedList<Integer> ll= new LinkedList<>();

        //add and remove
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);

        ll.removeFirst();
        ll.removeLast();

        //print
        System.out.println(ll);
    }
}
