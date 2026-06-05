// Q1 ForagivenintegerarrayofsizeN.
// Youhavetofindalltheoccurrences(indices)ofagivenelement(Key)
// andprintthem.Usearecursivefunctiontosolvethisproblem

//Q2 You are given a number (eg -  2019), convert it into a String of english 
// like“two zero one nine

//Q3 Write a program to findLength of aStringusing Recursion


public class practice {
    public static void keyIndice(int arr[],int idx ,int key){
        //base case
        if (idx==arr.length) return;

        if(arr[idx]==key) {
            System.out.print(idx+" ");
        }
        keyIndice(arr, idx+1, key);
    }

    public static void numToChar(int n){
        String arr[]={"zero", "one", "two", "three", "four", "five","six" ,"seven","eight","nine"};
        if(n/10==0){
            System.out.print(arr[n]+" ");
            return;
        }
        numToChar(n/10);
        System.out.print(arr[n%10]+" ");
    }

    public static int lengthString(String str,int idx){
        if(idx==str.length()){
            return idx;
        }
        return lengthString(str, idx+1);
    }



    public static void main(String[] args) {
        // int arr[]={1,5,3,4,5,4,7,5,4,3,7,5};
        // keyIndice(arr, 0, 5);

        // int n=69;
        // numToChar(n);

        String str="suhani";
        System.out.println(lengthString(str, 0));
     
    }
}
