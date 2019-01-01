package main;
import main.StudentPackage.RegisterStudent;
import java.util.Scanner;


class MainClass {
	public static void main(String args[]){
	RegisterStudent stud = new RegisterStudent();

	stud.getname();
		stud.getbranch();
for(int k=0;k<4;k++){
	System.out.println("Enter the details of sem "+(k+1));

	stud.register();
	stud.getmarks();
	stud.getgrade();
	stud.calculatesgpa(k);
	stud.calculatecgpa();

	}
}
}
