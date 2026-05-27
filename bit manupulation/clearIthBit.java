public class clearIthBit {
    public static int clearIthBit(int n, int i){ //make ith position 0
        return n & ~(1<<i); // ~(1<<i) is bitMask here
    }
    public static void main(String args[]){
       System.out.println(clearIthBit(10,3)); 
    }
}
