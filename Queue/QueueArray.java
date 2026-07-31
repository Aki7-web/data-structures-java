package Queue;

public class QueueArray {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr= new int[n];
            rear=-1;
            size=n;
        }

        //is empty condition
        public static boolean isEmpty(){
            return rear==-1;
        }

        //add condition O(1) ENQUEUE
        public static void add(int data){
            if(isEmpty()){
                arr[0]=data;
                rear= rear+1;
                return;
            }
            arr[rear+1]=data;
            rear=rear+1;
            return;

        }

        //remove fxtn(in array the time complexity for this is O(n)) DEQUEUE haha deque(double ended) is different
        public static int pop(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

        //peak fxtn O(1)
        public static int peek(){
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}
