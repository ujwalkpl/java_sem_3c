package packagesandInterfaces.StudentPackage;
import packagesandInterfaces.*;
import packagesandInterfaces.ResultPackage.*;
import java.util.Scanner;

class CreditLimit extends Exception {
	private int detail;

	CreditLimit(int a){
	detail=a;
	}

	public String toString(){
	return "Credit Limit Exception ["+detail+" ]";
	}

	}

public class RegisterStudent  extends Result implements Student{

	Scanner scan = new Scanner(System.in);

	public String name;
	public String branch;
	public float cgpa=0;


	public void getname(){
	System.out.println("Enter the name");
	name=scan.next();
	}

	public void getbranch(){
	System.out.println("Enter the branch");
	branch=scan.next();

	}

	public void  register() {
	System.out.println("Enter the number of subjects you want to register");
	num_sub=scan.nextInt();

  sub = new String[num_sub];
  credits = new int[num_sub];
	marks = new int[num_sub];
	gpa = new int[num_sub];
  grade = new char[num_sub];
	totalcredits=0;

	for(int i=0;i<num_sub;i++){
	System.out.println("Enter the name of subject " + (i+1));
	sub[i] = scan.next();
	System.out.println("Enter the number of credits");
	credits[i]=scan.nextInt();
	totalcredits=totalcredits+credits[i];
	}


	try{
	if(totalcredits>30)
		throw new CreditLimit(totalcredits);
	}catch(CreditLimit e){
		System.out.println(e);
	}
	}

	public void calculatecgpa(){
		cgpa=0;
		for(int i=0;i<4;i++){
			cgpa=cgpa+sgpa[i];
		}
		cgpa=cgpa/4;
	}

  }
