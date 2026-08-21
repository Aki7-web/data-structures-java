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

     static class Info{
            int d;
            int h;
            Info(int d, int h){
                this.d=d;
                this.h=h;
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

        //level order traversal O(n)
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

        public static int height(Node root){//height of a tree
            if(root==null){
                return 0;
            }
            int lf=height(root.leftNode);
            int rt=height(root.righNode);
            if(lf>=rt){
                return lf+1;
            }else{
                return rt+1;
            }

        }

        public static int nodes(Node root){
            if(root==null){
                return 0;
            }
            int l= nodes(root.leftNode);
            int r= nodes(root.righNode);
            return l+r+1;
        }

        public static int sumNodes(Node root){
            if(root==null){
                return 0;
            }
            int l= sumNodes(root.leftNode);
            int r= sumNodes(root.righNode);
            return l+r+root.data;
        }

        public static int diameter(Node root){// aproach 1 O(n^2) as in every node we hav to calculate diameter as well
            if(root==null){
                return 0;
            }
            int ld=diameter(root.leftNode);
            int rd=diameter(root.righNode);
            int lh=height(root.leftNode);
            int rh=height(root.righNode);
            int sd= lh+rh+1;
            return Math.max(Math.max(ld, rd),sd);
        }

       

        public static Info diameterOpt(Node root){ //optimised code O(n), as we dont hav to recursively find height
            if(root==null){
                int d=0;
                int h=0;
                return new Info(d, h);
            }
            Info li=diameterOpt(root.leftNode);
            Info ri=diameterOpt(root.righNode);
            int d=Math.max(Math.max(li.d,ri.d),li.h+ri.h+1);
            int h=Math.max(li.h,ri.h)+1;
            Info fin= new Info(d, h);
            return fin;

        }

        public static boolean isIdentical(Node node, Node subroot){
            // 1. Both ended at the same time → MATCH
            if(node==null && subroot==null){
                return true;
            }

            // 2. Only one ended → NOT MATCH
            if(node==null || subroot==null){
                return false;
            }

            // 3. Both exist → compare their data
            if(node.data != subroot.data){
                return false;
            }

            return isIdentical(node.leftNode, subroot.leftNode) && isIdentical(node.righNode, subroot.righNode);
        }

        public static boolean isSubtree(Node root ,Node subroot){
            // Subtree is empty → technically it is a subtree
            if(subroot==null){
                return true;
            }
            // Main tree is empty but subtree isn't
            if(root==null){
                return false;
            }

             // If current node matches subtree root,
            // check whether the complete subtree is identical
            if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }

            // Otherwise search in left and right subtrees
            return isSubtree(root.leftNode, subroot) || isSubtree(root.righNode, subroot);
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,2,-1,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.builtTrees(nodes);

        BinaryTree.idx=-1;
        int nodes2[]={2,4,-1,-1,5,4,-1,-1,-1};
        Node subroot= tree.builtTrees(nodes2);
        //System.out.println(root.data);
        //tree.preorder(root);
        //tree.inorder(root);
        //tree.levelorder(subroot);
        //System.out.println(tree.height(root));
        //System.out.println(tree.nodes(root));
        //System.out.println(tree.sumNodes(root));
        //System.out.println(tree.diameter(root));
        // Info i=tree.diameterOpt(root);
        // System.out.println(i.d);
        // System.out.println(i.h);
        System.out.println(tree.isSubtree(root, subroot));
    }
}


