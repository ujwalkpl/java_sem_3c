import java.util.Scanner;
class fibonacciwithrecursion{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the series size");
    int n=scan.nextInt();
    for(int i=0;i<n;i++){
      System.out.print(fibonacci(i)+" ");
    }

  }
  static int fibonacci(int value ){
    int result;
    if(value <2)
      return value;
    else
      return result=fibonacci(value-1)+fibonacci(value-2);

}
}
