package LinkedLists;
import java.util.LinkedList;

//excecution of code is in LinkedList file

public class MergeSortLL {

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

    public Node findMidd(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node merge(Node left, Node right){
        Node mergeLL= new Node(-1);
        Node temp= mergeLL;
        
        while(left!=null && right !=null){
            if(left.data<=right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }

        while(left!=null){
            temp.next=left;
            temp=temp.next;
            left=left.next;
        }
        while(right!=null){
            temp.next=right;
            temp=temp.next;
            right=right.next;
        }

        return mergeLL.next;
    }

    public Node mergeSort(Node head){ //O(nlogn)

        //base
        if(head==null || head.next==null){
            return head;
        }

        //mid find
        Node mid= findMidd(head);
        Node rightHead= mid.next;
        mid.next=null;

        //left - right MS
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);

        //merge
        Node mergedLL= merge(newLeft,newRight);
        return mergedLL;
    }
}
