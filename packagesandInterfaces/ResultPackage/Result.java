package main.ResultPackage;
import java.util.Scanner;
public class Result{
	Scanner scan = new Scanner(System.in);
	public int num_sub;
	public String sub[]=new String[num_sub];
	public int marks[]=new int[num_sub];
	public  int credits[];
	public int totalcredits;
	public int gpa[] = new int[num_sub];
	public char grade[] = new char[num_sub];
	public float sgpa[]=new float[4];
	public void getmarks(){
		System.out.println(marks.length);
	  for(int i=0;i<sub.length;i++){
		System.out.println("Enter the marks of " + sub[i]);
		marks[i]=scan.nextInt();
  }
}

	public void getgrade(){
		for(int i=0;i<num_sub;i++){
			if(marks[i]>100){
				gpa[i]=11;
				grade[i]='z';
			}
			if(marks[i]>=90){
				gpa[i]=10;
				grade[i]='S';
			}
			else if(marks[i]>=80){
				gpa[i]=9;
				grade[i]='A';
			}
			else if(marks[i]>=70){
				gpa[i]=8;
				grade[i]='B';
			}
			else if(marks[i]>=60){
				gpa[i]=7;
				grade[i]='C';
			}
			else if(marks[i]>=50){
				gpa[i]=6;
				grade[i]='D';
			}
			else if(marks[i]>=40){
				gpa[i]=5;
				grade[i]='E';
			}
			else {
				gpa[i]=0;
				grade[i]='F';
			}
		}
	}
	public void calculatesgpa(int n){

		for(int i=0;i<num_sub;i++){
			sgpa[n]=sgpa[n]+(gpa[i]*credits[i]);
		}
		sgpa[n]=sgpa[n]/(totalcredits);
		System.out.println("The sgpa is "+sgpa[n]);
	}

	}
