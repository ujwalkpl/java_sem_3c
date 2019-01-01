import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
class linkedlist{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    LinkedList<String> linlis = new LinkedList<String>();
    System.out.println("1.Insert an element into the list\n2.Delete an element from the list\n3.list all the elements with length less than 5\n4.Display");
    int choice;
    do{
      System.out.println("Enter the choice");
      choice= scan.nextInt();
      switch(choice){
        case 1:
          System.out.println("Enter the element to insert");
          linlis.add(scan.next());
          break;
        case 2:
          System.out.println("Enter the index of the element to delete");
          if(linlis.isEmpty())
            System.out.println("no element to delete");
            else
          linlis.remove(scan.nextInt());
          break;
        case 3:
          Iterator<String> itr = linlis.iterator();
          String a;
          while(itr.hasNext()){
            a=itr.next();
            if(a.length()<5){
              System.out.println(a);
            }
          }
          break;
        case 4:
          itr=linlis.iterator();
          while(itr.hasNext()){
            System.out.println(itr.next());
          }
          break;
      }
    }while(choice!=5);
  }
}
