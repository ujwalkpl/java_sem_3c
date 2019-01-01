package packagesandexceptions.ISE;
import packagesandexceptions.*;
import java.util.Scanner;
class ISE_department implements Department extends Faculty{

  void readdata(){
    System.out.println("Enter the Faculty name");
    name=scan.next();
    System.out.println("Enter the designation");
    designation=scan.next();
    System.out.println("Enter the age");
    age=scan.nextInt();
    System.out.println("Enter years of experience");
    years_of_experience=scan.nextInt();
    System.out.println("Enter joining date (dd/mm/yyyy)");
    joining_date=scan.nextInt();
    System.out.println("Enter the number of subjects handled");
    int subjects_handled[]=new int[scan.nextInt()];
    for(int i=0;i<subjects_handled.length;i++){
      System.out.println("Enter subject number "+(i+1));
      subjects_handled[i]=scan.next();
    }
  }
  
  void printdata();
  void print_number_designations();
  void number_research_consultancy_projs();
}
