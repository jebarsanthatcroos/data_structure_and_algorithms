import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);



        System.out.print("enter the size :");
         int size = scanner.nextInt();
        int []array = new  int[size];
        Queue queue =new Queue(size);


        for (int i = 0; i <size; i++) {
            System.out.print("enter array"+(1+i)+" data:");
            array[i] = scanner.nextInt();

        }
        for (int i:
             array) {
            queue.Enqueue(i);

        }
        System.out.println("  display the Queue elements");
        queue.Display();

        System.out.println( "front element is:"+queue.frontElement());

        queue.Dequeue();

        System.out.println(" Remaining elements");
        queue.Display();

scanner.close();

    }

}