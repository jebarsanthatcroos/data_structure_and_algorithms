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

 insertionSort(array);
        System.out.print("[");
        for (int i:
             array) {
            System.out.print(" "+i);

        }
        System.out.print("]");
        System.out.println();


scanner.close();

    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length ; i++) {
             int temp = array[i];
              int j = i-1;

              while ( j>=0 && array[j]< temp){
                 array [j+1] = array[j];
                 j --;

              }
               array[j+1]= temp;

        }
    }


}

