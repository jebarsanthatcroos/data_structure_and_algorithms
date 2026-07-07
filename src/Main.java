import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);



        System.out.print("enter the size :");
         int size = scanner.nextInt();
        int []array = new  int[size];


        for (int i = 0; i <size; i++) {
            System.out.print("enter array"+(1+i)+" data:");
            array[i] = scanner.nextInt();

        }

         bobblesort(array);
        System.out.print("[");
        for (int i:
             array) {
            System.out.print(" "+i);

        }
        System.out.print("]");
        System.out.println();


scanner.close();

    }

    private static void bobblesort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
               if (array[j] > array[j+1]){
                  int tepm = array[j];
                  array[j]= array[j+1];
                  array[j+1]= tepm;

            }

        }
    }

    }
}
