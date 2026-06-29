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

    public static boolean loop(){//slow-fast approach , floyds cycle finding algorithm
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

    public static void main(String[] args) {
        head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        //head.next.next.next=head;//loop

        System.out.println(loop());
    }
}

// 0 -> 0 -> 0 -> 0 -> 0
//            |  loop  |
//            0 <- 0 <- 0
//infinite loop, no null