public class stack {
     private final int[] stack;
     private  int top =-1;


      stack(int  size){
           stack= new  int[size];
      }

       private boolean isEmpty(){
           return  top == -1;
       }
    private boolean isFull(){
        return  top == stack.length-1;
    }



         public  void push(int data) {
             if (isFull()) {
                 System.out.println(" stack overflow");
                 return;
             }
              stack[++top]=data;
         }


          public  void  Display(){
           if(isEmpty()){
               System.out.println("stack  underflow");
               return;
           }
              System.out.print("[");
              for (int i = top; i >= 0 ; i--) {

                  System.out.print( " "+stack[i]);


              }
              System.out.print("]");
              System.out.println(" ");
          }

           public void pop(){
               if(isEmpty()){
                   System.out.println("stack  underflow");
                   return;
               }
               top--;


           }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack  underflow");
            return -1;
        }
        return  stack[top];


    }


}
