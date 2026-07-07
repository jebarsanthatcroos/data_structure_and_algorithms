import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);



        System.out.print("enter the size :");
         int size = scanner.nextInt();
        int []array = new  int[size];
        stack s =new stack(size);


        for (int i = 0; i <size; i++) {
            System.out.print("enter array"+(1+i)+" data:");
            array[i] = scanner.nextInt();

        }
        for (int i:
             array) {
            s.push(i);

        }
        System.out.println("  display the  stack data");
          s.Display();

        System.out.println( "front element is:"+s.peek());

s.pop();

        System.out.println("  display the   afate stack data");
s.Display();

scanner.close();

    }

}