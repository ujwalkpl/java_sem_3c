import java.util.Scanner;
class account{
  Scanner scan = new Scanner(System.in);
int Accno;
String name;
int Phone_No;
float balance_amt=0;

  void getinput(){
    System.out.println("Enter the Accno");
    Accno=scan.nextInt();
    System.out.println("Enter the name");
    name=scan.next();
    System.out.println("Enter the Phone_No");
    Phone_No=scan.nextInt();
    System.out.println("Enter the balance_amt");
    balance_amt=scan.nextFloat();
  }

  void Deposit(float amt){
  balance_amt=balance_amt+amt;
  System.out.println(balance_amt);
  }

  void Withdraw(float amt){
    if(amt>balance_amt){
      System.out.println("Insufficient funds");
    }else {
      balance_amt=balance_amt-amt;
      System.out.println(balance_amt);
    }
  }


  public static void main(String args[]){
    Scanner scann=new Scanner(System.in);
   account acc = new account();
   int choice;
   acc.getinput();
   System.out.println("1.Deposit\n2.Withdraw");
   do {
     System.out.println("Enter the choice");
     choice=scann.nextInt();
     switch(choice){
       case 1:
       System.out.println("Enter the amount to be deposited");
        acc.Deposit(scann.nextFloat());
        break;
      case 2:
        System.out.println("Enter the amount to be withdrawn");
        acc.Withdraw(scann.nextFloat());
        break;
      case 3:
        java.lang.System.exit(0);
        break;


     }
   } while (choice!=3);

  }
}
