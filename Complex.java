import java.util.Scanner;

class Complex{

  int real,imag;
  Complex(int real,int imag){
    this.real=real;
    this.imag=imag;
  }
  Complex add(Complex a){
    Complex temp=new Complex(0,0);
    temp.real=this.real+a.real;
    temp.imag=this.imag+a.imag;
    return temp;
  }

  Complex multiply(Complex a){
    Complex temp= new Complex(0,0);
    temp.real=this.real*a.real-this.imag*a.imag;
    temp.imag=this.real*a.imag+this.imag*a.real;
    return temp;
  }
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number");
    Complex first = new Complex(scan.nextInt(),scan.nextInt());

    System.out.println("Enter the second number");
    Complex second = new Complex(scan.nextInt(),scan.nextInt());

    Complex temp;
    temp=first.add(second);
    System.out.println("The sum is "+temp.real+" + i"+temp.imag);

    temp=first.multiply(second);
    System.out.println("The product is "+temp.real+" + i"+temp.imag);
  }
}
