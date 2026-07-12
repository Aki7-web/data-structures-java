package Stack;

import java.util.*;

public class Stack {
    static class StackAl{ //al- array list
        static ArrayList<Integer> list= new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
             if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

    static class StackLL{
         static Node head=null;

         static boolean isEmpty(){
            return head==null;
         }

         //push ,in LL head is the top of stack
         static void push(int data){
            Node newnNode= new Node(data);
            if(isEmpty()){
                head=newnNode;
                return;
            }

            newnNode.next=head;
            head=newnNode;
         }

         //pop
         static int pop(){
            if(isEmpty()){
                return -1;
            }
            
            int top= head.data;
            head=head.next;
            return top;
         }

         //peek
         static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
         }

    }
    
    public static void main(String[] args) {
        //StackAl s= new StackAl();
        StackLL st= new StackLL();
        st.push(1);
        st.push(2);
        System.out.println(st.peek());
    }
}
