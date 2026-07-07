public class Queue {
    private final int[]queue;
    private  int  front= -1 ,  rear = -1;
    public Queue(int size) {
        queue = new int[size];
    }

      private boolean isEmpty(){
        return front == -1 || front> rear;
      }

       private  boolean isFull(){
        return  rear == queue.length -1;
       }

    public void Enqueue(int data) {
          if (isFull()){
              System.out.println(" queue overflow");
               return;
          }
           if(front == -1){
                front = 0;
           }
             queue[++rear]=data;
    }

    public void Display() {
         if ( isEmpty()){
             System.out.println("queue underflow");
              return;
         }
        System.out.print("[");
        for (int i = front; i <= rear; i++) {
            System.out.print( " "+queue[i]);

        }
        System.out.print("]");
        System.out.println();
    }

    public int frontElement() {
        if ( isEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        return queue [front];

    }

    public void Dequeue() {
        if ( isEmpty()){
            System.out.println("queue underflow");
            return;
        }
        front++;

    }
}
