package dividnconquersheet;

public class inversionCount {
    public static int inversion(int arr[]){
        int ct=0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]) {
                    ct++;
                }
            }
        }
        return ct;
    }

    public static int inversion2(int numbers[]){
         int swap=0;
        for(int i=0; i<numbers.length-1;i++){ //no. of turns
            for(int j=0;j<numbers.length-1-i;j++){ //no. of swap checking conditions
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]=temp;
                    swap++;
                }
               
            }
        }
        return swap;
    }

   

    public static void main(String[] args) {
        int arr[]={2, 4, 1, 3, 5};
        // System.out.println(inversion(arr));
        System.out.println(inversion2(arr));

    }
}
