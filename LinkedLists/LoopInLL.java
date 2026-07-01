package LinkedLists;

public class LoopInLL {
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

    //floyds cycle finding algorithm

    public static boolean loop(){//slow-fast approach , 
        Node slow=head;//+1
        Node fast=head;//+2
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;//cycle loop exists
            }
        }
        return false;//loops doesnt exist
    }

    //if cycle detected then remove cycle code
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast= head;
        boolean cycle= false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;//otherwise loop goes on
            }
        }
        if(cycle=false){
            return;
        }

        //slow=head and then slow fast both +1 until they meet ,fast with a prev pointer
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //prev.next=null
        prev.next=null; //cycle broken
        return;
    }

    public static void main(String[] args) {
        head= new Node(1);
        Node temp= new Node(2);
        head.next= temp;
        head.next.next= new Node(3);
        head.next.next.next=temp;//loop

        System.out.println(loop());
        removeCycle();
        System.out.println(loop());
    }
}

// 0 -> 0 -> 0 -> 0 -> 0
//            |  loop  |
//            0 <- 0 <- 0
//infinite loop, no null