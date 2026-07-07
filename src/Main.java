import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);



        System.out.print("enter the size :");
         int size = scanner.nextInt();
        int []array = new  int[size];
        CircularQueue circularqueue=new CircularQueue(size);


        for (int i = 0; i <size; i++) {
            System.out.print("enter array"+(1+i)+" data:");
            array[i] = scanner.nextInt();

        }
        for (int i:
             array) {
            circularqueue.Enqueue(i);

        }
        System.out.println("  display the Queue elements");
        circularqueue.Display();

        System.out.println( "front element is:"+circularqueue.frontElement());

        circularqueue.Dequeue();

        System.out.println(" Remaining elements");
        circularqueue.Display();

scanner.close();

    }

}