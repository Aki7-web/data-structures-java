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
    public static int size;

    //methods
    //add first O(1) constant operation
    public void addFirst(int data){
        //step-1 create new node
        Node newNode= new Node(data);
        size++;
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
        size++;
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

    //add in middle O(n) adding is constant but finding idx takes linear time
    public void add(int data, int idx){
        if(idx==0){ //adding in start
            addFirst(data);
            return;
        }

        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //remove first O(1)
    public int removeFirst(){ //return the removed node data

        //base case
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }

        int value=head.data;
        head=head.next;
        size--;
        return value;

    }

    //remove last O(n)
    public int removeLast(){
         //base case
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }

        Node temp=head;
        while (temp.next != tail) {
            temp=temp.next;
        }
        int val=tail.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;

    }

    //iterative search O(n) becoz of loop
    public int itrSearch(int key){
        if(size==0){
            System.out.println("empty ll");
            return Integer.MIN_VALUE;
        }
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }

        return -1;
    }

    //recursive search O(n)-time & O(n)-space because of recursive call statck
    public int helperFxt(Node head, int key){//recursive fxtn
        if(size==0){
            System.out.println("empty ll");
            return Integer.MIN_VALUE;
        }
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }
        int idx=helperFxt(head.next, key);

        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){//calling fxtn helped by helper fxtn
        return helperFxt(head, key);
    }

    //reverse linked list O(n)
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //find and remove nth node from end
    public void removeNthEnd(int n){
        int sz=0;
        Node temp=head;
        while (temp != null) {
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return;
        }

        //for other case we need the prev node to the one we want to delete
        Node prev=head;
        int i=1;//1st node
        int idxToF=sz-n;
        while (i<idxToF) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //check palindrome

    //by slow-fast approach
    public Node findMid(){//helper fxtn to find mid node
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        //general
        if(head==null || head.next==null){
            return true;
        }

        //step1- find mid
        Node midNode= findMid();

        //step2- reverse 2nd half
        Node prev=null;
        Node curr= midNode;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right= prev; //right half's head
        Node left= head;

        //step3- compare the two halfs for equality
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(2);
       // ll.add(5, 2);
        ll.print();
       // System.out.println(ll.size);
        //ll.print();
        //System.out.println(ll.size);
        //ll.removeLast();
        //ll.print();
        //System.out.println(ll.size);
        //System.out.println(ll.itrSearch(5));
        //System.out.println(ll.recSearch(5));
        //ll.reverse();
        //ll.print();
      //  ll.removeNthEnd(3);
        //ll.print();
        System.out.println(ll.checkPalindrome());

    }
}
