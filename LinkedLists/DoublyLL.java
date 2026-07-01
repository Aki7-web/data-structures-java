package LinkedLists;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;

        if(head==null){
            head=tail= newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    //print
    public void print(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }

        Node temp= head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //removeFirst
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int value=head.data;
            head=tail=null;
            size--;
            return value;
        }

        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //addLast
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail= newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    //removeLast
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int value=tail.data;
            head=tail=null;
            size--;
            return value;
        }

        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        return val;
    }

    //reverse
    public void reverse(){
        Node prev=null;
        Node curr = head;
        Node next;
        tail=head;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.addLast(6);
        dll.addLast(7);
        dll.print();
        dll.reverse();;
        dll.print();
        dll.removeLast();
        dll.print();
    }
}
