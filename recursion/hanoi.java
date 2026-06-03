//minimum moves 2^n -1

public class hanoi {
    public static void hanoi(int n, char s, char h, char d){

        //base case
        if(n==1){
             System.out.println("block "+ n+" from "+s+" to "+d);
             return;
        }

        //move n-1 blocks from source to helper
        hanoi(n-1, s, d, h);

        //move largest nth block from source to dest
        System.out.println("block "+ n+" from "+s+" to "+d);

        //move n-1 blocks from helper to dest
        hanoi(n-1, h, s, d);
    }

    public static void main(String[] args) {
        hanoi(4, 'A', 'B', 'C');
    }
}
