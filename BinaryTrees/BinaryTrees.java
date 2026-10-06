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

    static class Infoo{
            Node node;
            int hd;
            Infoo(Node node,int hd){
                this.hd=hd;
                this.node=node;
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

        

        //top overview of tree
        public static void topView(Node root){
            HashMap<Integer,Node> map= new HashMap<>();
            Queue<Infoo> q= new LinkedList<>();
            q.add(new Infoo(root, 0));
            q.add(null);
            int max=0,min=0; 
            while(!q.isEmpty()){
                Infoo curr= q.remove(); 
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if(!map.containsKey(curr.hd)){
                        map.put(curr.hd, curr.node);
                    }
                    if(curr.node.leftNode!=null){
                        q.add(new Infoo(curr.node.leftNode,curr.hd-1));
                        min=Math.min(min,curr.hd-1);
                    }
                    if(curr.node.righNode!=null){
                        q.add(new Infoo(curr.node.righNode,curr.hd+1));
                        max=Math.max(max,curr.hd+1);
                    }
                }
            }

            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
        }

        public static void printKlevel(Node root, int level, int k){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.print(root.data+" ");
                return;
            }
            printKlevel(root.leftNode, level+1, k);
            printKlevel(root.righNode, level+1, k);
        }

        public static Boolean getPath(Node root, int n, ArrayList<Node> path){

            if (root==null){
                return false;
            }
            if(root.data==n){
                return true;
            }
            path.add(root);

            Boolean foundLeft = getPath(root.leftNode, n, path);
            Boolean foundRight = getPath(root.righNode, n, path);

            if(foundLeft || foundRight){
                return  true;
            }

            path.remove(path.size()-1);
            return false;
        }

        public static Node lca(Node root,int n1, int n2) {//lowest common ancestor
            //aux space of arraylist O(n), rec stack space ,O(n) time
            ArrayList<Node> path1= new ArrayList<>();
            ArrayList<Node> path2= new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            int i=0;
            for(;i<path1.size()&& i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }

            Node lca=path1.get(i-1);
           

            return lca;


        }

        public static Node lca2(Node root,int n1, int n2){ //no extra auxliary space , only recursion stack O(n) space and time complx
            if(root==null || root.data==n1 || root.data==n2 ){
                return root;
            }

            Node leftLca= lca2(root.leftNode, n1, n2);
            Node rightLca= lca2(root.righNode, n1, n2);

            if(leftLca==null){
                return rightLca;
            }
            if(rightLca==null){
                return leftLca;
            }

            return root;
        }

        public static int lcaDis(Node root, int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }

            int lefDist= lcaDis(root.leftNode, n);
            int righDist= lcaDis(root.righNode, n);

            if(lefDist==-1 && righDist==-1){
                return -1;
            }else if(lefDist==-1){
                return righDist+1;
            }else{
                return lefDist+1;
            }
        }

        public static int minDis(Node root, int n1, int n2){//number of edges / in between the nodes
            Node lca= lca(root, n1, n2);

            int dis1 =lcaDis(lca, n1);
            int dis2= lcaDis(lca, n2);

           return dis1+dis2;

        }

        public static int KAncestor(Node root, int n, int k){//kth ancestor of node n
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }

            int lefDis= KAncestor(root.leftNode, n, k);
            int righDis=KAncestor(root.righNode, n, k);

            if(lefDis==-1 && righDis==-1){
                return -1;
            }

            int max= Math.max(lefDis, righDis);
            if(max+1==k){
                return root.data;
            }
            return max+1;
        }

        public static int transformSumTree(Node root){//O(n) node transformed as sum of its whole left and right branch
            if(root==null){
                return 0;
            }
            int leftVal= transformSumTree(root.leftNode);
            int rightVal= transformSumTree(root.righNode);

            int data= root.data;
            int newLeft= root.leftNode==null? 0: root.leftNode.data;
            int newRight= root.righNode==null?0: root.righNode.data;

            root.data= leftVal+ newLeft+rightVal+ newRight;

            return data;

        }

        public  static void preeorder(Node root){
            if(root==null){
                return;
            }

            System.out.print(root.data+" ");
            preeorder(root.leftNode);
            preeorder(root.righNode);
        }

    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,2,-1,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.builtTrees(nodes);

        BinaryTree.idx=-1;
        int nodes2[]={2,4,-1,-1,5,4,-1,-1,-1};
        Node subroot= tree.builtTrees(nodes2);
        //System.out.println(root.data);
        //tree.preorder(root);
        //tree.inorder(root);
        //tree.levelorder(root);
        //System.out.println(tree.height(root));
        //System.out.println(tree.nodes(root));
        //System.out.println(tree.sumNodes(root));
        //System.out.println(tree.diameter(root));
        // Info i=tree.diameterOpt(root);
        // System.out.println(i.d);
        // System.out.println(i.h);
        //System.out.println(tree.isSubtree(root, subroot));
        //tree.topView(root);
        //tree.printKlevel(root, 1, 2);
        //System.out.println(tree.lca(root, 5, 6).data);
        //System.out.println(tree.lca2(root, 5, 6).data);
        //System.out.println(tree.minDis(root, 5, 6));
        //System.out.println(tree.KAncestor(root, 5, 2));
        tree.transformSumTree(root);
        tree.preeorder(root);

    }
}


