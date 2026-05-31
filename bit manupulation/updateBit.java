public class updateBit {
    public static int clearIthBit(int n, int i){ //make ith position 0
        return n & ~(1<<i); // ~(1<<i) is bitMask here
    }
    public static int updateBit(int n, int i, int newBit){
        n= clearIthBit(n, i);
        int bitMask= newBit<<i;
        return n | bitMask;
    }
    public static void main(String args[]){
        System.out.println(updateBit(10, 0, 1));
    }
    
}
