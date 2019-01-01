import java.util.Scanner;

class stackprogram{
    int size;
    int top;
    int stack[];
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the size of the stack");
      stackprogram stk = new stackprogram(scan.nextInt());

      System.out.println("Stack operations\n1.push\n2.pull");
      int choice;
      do {
        System.out.println("Enter the choice");
        choice=scan.nextInt();
        switch(choice){
          case 1:
            System.out.println("Enter the element you want to insert");
            stk.push(scan.nextInt());
            break;
          case 2:
            System.out.println(stk.pull());
            break;
          case 3:
            java.lang.System.exit(0);
            break;
        }
      } while (choice!=3);
    }
    stackprogram(int size){
      this.size=size;
      stack= new int[size];
      top=-1;
    }
    void push(int num){
      if(top==size-1){
        System.out.println("Stack overflow");
      }
      else{
        stack[++top]=num;
      }
    }

    int pull(){
      if(top==-1){
        System.out.println("Stack underflow");
        return(-1);
      }
      else{
        return stack[top--];
      }
    }
}
