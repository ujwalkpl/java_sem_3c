import java.util.Scanner;
import java.util.ArrayList;

class arraylist{
  public static void main(String args[]){
    int choice;
    Scanner scan = new Scanner(System.in);
    ArrayList<String> arrlis = new ArrayList<String>();
    System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.peak element\n5.Exit");
    do {
      System.out.println("Enter the choice");
      choice = scan.nextInt();
      switch(choice){
        case 1:
          System.out.println("Enter the element to insert");
          arrlis.add(scan.next());
          break;
        case 2:
          if(arrlis.isEmpty())
            System.out.println("no element to delte");
          else
          System.out.println("The removed element is "+ arrlis.remove(0));
          break;
        case 4:
        if(arrlis.isEmpty())
          System.out.println("Queue is empty");
        else
          System.out.println(arrlis.get(0));
          break;
        case 3:
        if(arrlis.isEmpty())
          System.out.println("no element to display");
          else{
            for(int i=0;i<arrlis.size();i++){
              System.out.print(arrlis.get(i)+" ");
            }
          }
          break;
        case 5:
        System.exit(0);
        break;

      }
    } while (choice!=5);
  }
}
