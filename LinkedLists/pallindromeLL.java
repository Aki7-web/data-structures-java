package LinkedLists;
//time comp O(n) and space O(1)
//if u transfer the nodes to array and check array is palindrome works but then 
//space O(n)

//functioning of code is shown in LinkedList.java file with other methods

public class pallindromeLL {
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
}
