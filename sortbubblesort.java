import java.util.Scanner;
class sortbubblesort{

  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = scan.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
int temp;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }

    System.out.println("The array elements after sorting are");
    for(int i:arr){
      System.out.print(i+" ");
    }

  }
}
