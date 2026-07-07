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

  selectionsort(array);
        System.out.print("[");
        for (int i:
             array) {
            System.out.print(" "+i);

        }
        System.out.print("]");
        System.out.println();


scanner.close();

    }

    private static void selectionsort(int[] array) {
        for (int i = 0; i < array.length-1 ; i++) {
             int mini =i;
            for (int j = i+1; j < array.length ; j++) {
                if (array[j] > array[mini]) {
                    mini = j;

                }
            }

                  int temp = array[mini];
                 array[mini]= array[i];
                 array[i] =temp;

        }
    }


}

