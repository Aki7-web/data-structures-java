public class clearIBits{
    public static int clearIbits(int n, int i){ //clear =0  set==1

        int bitMask= (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIbits(10,3));
    }
}