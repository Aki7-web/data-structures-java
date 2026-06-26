package LinkedLists;
import java.util.*;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    //methods
    //add first O(1) constant operation
    public void addFirst(int data){
        //step-1 create new node
        Node newNode= new Node(data);
        //if linked list is initially empty
        if(head==null){
            head=tail=newNode;
        }

        //or point newnodes next to head
        newNode.next=head;

        //then change head
        head=newNode;
    }

     //add last O(1) constant operation
    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
        }

        tail.next=newNode;

        tail=newNode;
    }

    //print list O(n) traverse
    public void print(){ //no parameter as we hav head as static everywhere of Node class
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
    }
}
