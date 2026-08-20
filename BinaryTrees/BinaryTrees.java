package BinaryTrees;
import java.util.*;

public class BinaryTrees {
    static class Node{
        int data;
        Node leftNode;
        Node righNode;
        Node(int data){
            this.data=data;
            this.leftNode=null;
            this.righNode=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;

        public static Node builtTrees(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode= builtTrees(nodes);
            newNode.righNode= builtTrees(nodes);

            return newNode;
        }

        public static void preorder(Node root){//traversal technique O(n)
            if(root==null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.leftNode);
            preorder(root.righNode);

        }

        public static void inorder(Node root){//inorder travel , left-> node-> right
            if(root==null){
                //System.out.print(-1+" ");
                return;
            }
            inorder(root.leftNode);
            System.out.print(root.data+" ");
            inorder(root.righNode);
        }

        public static void postorder(Node root){//inorder travel , left-> right=>node 
            if(root==null){
                //System.out.print(-1+" ");
                return;
            }
            postorder(root.leftNode);
            postorder(root.righNode);
            System.out.print(root.data+" ");
        }

        //level order traversal
        public static void levelorder(Node root){//level wise, left to right in levels
            Queue<Node> q= new LinkedList<>();

            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode= q.remove();
                if(currNode==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        System.out.println();
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.leftNode!=null){
                        q.add(currNode.leftNode);
                    }
                    if(currNode.righNode!=null){
                        q.add(currNode.righNode);
                    }
                }

            }

        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.builtTrees(nodes);
        //System.out.println(root.data);
        //tree.preorder(root);
        //tree.inorder(root);
        tree.levelorder(root);
    }
}


