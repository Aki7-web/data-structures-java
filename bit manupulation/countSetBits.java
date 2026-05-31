public class countSetBits {

    public static int countSet(int n){
        int count=0;
        while(n>0){   //O(n)=log n because any number can be written in logn +1 bits max
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSet(15));
    }
}
