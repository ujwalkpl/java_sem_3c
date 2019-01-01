import java.util.Scanner;
class Employee_det{
   Scanner scan=new Scanner(System.in);
     String name;
     float  age;
     String education;
     float salary;
     int years_of_experience;
     int number_of_loans;
     float loan_amount;
     double basic=salary-0.4*salary-0.5*salary;
   void display(){
    System.out.println(name);
System.out.println(age);
System.out.println(education);
System.out.println(salary);
System.out.println(years_of_experience);
System.out.println(number_of_loans);
System.out.println(loan_amount);
    }

   boolean iseligible(){
     if(loan_amount>basic&&number_of_loans<2)
       return true;
      else return false;
   }
   double taxPay(){
     if(salary>1000000)
      return 0.3*salary;
     else if(salary>500000)
      return 0.2*salary;
     else if(salary>200000)
      return 0.1*salary;
      else return 0;
    }
   boolean isEligiblePromotion(){
     if(years_of_experience>5)
       return true;
    else return false;
     }
    Employee_det(){
     System.out.println("Enter Employee details\n");
     System.out.println("Name");
     name=scan.next();
     System.out.println("\nAge");
     age=scan.nextInt();
     System.out.println("\nEducation");
     education=scan.next();
     System.out.println("\nSalary");
     salary=scan.nextFloat();
     System.out.println("\nYears of Experience");
     years_of_experience=scan.nextInt();
     System.out.println("\nNumber of loans");
     number_of_loans=scan.nextInt();
     System.out.println("\nLoan amount");
      loan_amount=scan.nextFloat();
     }
}

class employee{
  public static void main(String[] args){
   Scanner scan =new Scanner(System.in);
   int n,choice;
   System.out.println("Enter the number of Employees");
   n=scan.nextInt();
   Employee_det emp[]=new Employee_det[n];
   for(int i=0;i<n;i++){
   System.out.println("Employee number " + i+"\n");
   emp[i]=new Employee_det();
  }

   System.out.println("Enter the employees number\n");
   int num=scan.nextInt();
do{
   System.out.println("Enter the choice\n1.Eligibility for loan\n2.Tax amount to be paid\n3.Eligibility for promotion\n4.Exit");
   choice=scan.nextInt();
   switch(choice){
    case 1:
      if(emp[num+1].iseligible())
       System.out.println("Eligible\n");
      else
       System.out.println("Not Eligible\n");
      break;
    case 2:
      System.out.println(emp[num].taxPay());
      break;
     case 3:
       if(emp[num+1].isEligiblePromotion())
       System.out.println("Eligible\n");
       break;
     case 4:

       System.out.println("Exit");
     }

   }while(choice!=4);
  for(int i=0;i<n;i++){
   System.out.println("Employee "+i+1);
    if(emp[i].iseligible())
       System.out.println("Eligible for loan\n");
      else
       System.out.println("Not Eligible for loan\n");

    System.out.println("Tax amount to be paid"+emp[num+1].taxPay());
  }
}
}
