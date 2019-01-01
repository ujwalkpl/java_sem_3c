import java.util.Scanner;
class fibonacciwithoutrecursion{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int fibbo1,fibbo2,fibbo3;
    fibbo1=0;
    fibbo2=1;

    System.out.println("Enter the size of the series");

    int size = scan.nextInt();
      System.out.print(fibbo1+" "+fibbo2+" ");
    for(int i=0;i<size-2;i++){

    fibbo3=fibbo2+fibbo1;
    System.out.print(fibbo3+" ");
    fibbo1=fibbo2;
    fibbo2=fibbo3;

  }

  }
}
