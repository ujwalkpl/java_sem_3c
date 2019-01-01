import java.util.Scanner;
import java.util.Arrays;
class stringss{
  public static void main(String args[]){
    int choice;
    String s;
    Scanner scan = new Scanner(System.in);
    System.out.println("1.find the substring\n2.Read a text and count all the occurrences of a particular word.\n3.Replace a substring in the given string.\n4.Rearrange the string and rewrite in alphabetical order.\n5.Compare two strings ignoring case.\n6.Concatenate two strings.");
    do {
      System.out.println("Enter the choice");
      choice= scan.nextInt();
      scan.nextLine();
      switch(choice){
        case 1:
          System.out.println("Enter the String");
          s=scan.nextLine();
          System.out.println("Enter the position and length of the String");
          int n=scan.nextInt();
          int m=scan.nextInt();
          System.out.println(s.substring(n-1,n+m-1));
          break;
        case 2:
          System.out.println("Enter the string");
          s = scan.nextLine();
          System.out.println("Enter the word whose occurence is to be found");
          String findstr= scan.next();
          int lastfind=0;
          int count=0;
          while(lastfind!=-1){
            lastfind=s.indexOf(findstr,lastfind);
            if(lastfind!=-1){
              count++;
              lastfind=lastfind+findstr.length();
            }
          }
          System.out.println(count);
          break;
        case 3:
          System.out.println("Enter the string");
          s=scan.nextLine();
          System.out.println("Enter the part of the string to replace");
          String a=scan.next();
          System.out.println("What should it be replaced with");
          String b=scan.next();
          System.out.println("The replaced String is "+s.replace(a,b));
          break;
        case 4:
          System.out.println("Enter the string");
          s=scan.nextLine().toLowerCase();
          char arr[]=s.toCharArray();
          Arrays.sort(arr);
          System.out.println(arr);

          break;

        case 5:
          System.out.println("Enter the first String");
          s=scan.nextLine();
          System.out.println("Enter the second string");
          String se=scan.nextLine();
          if(s.equalsIgnoreCase(se))
            System.out.println("The strings are equal");
          else
            System.out.println("They are not equal");
          break;
        case 6:
          System.out.println("Enter the first String");
          s=scan.nextLine();
          System.out.println("Enter the second string");
          String ab=scan.nextLine();
          System.out.println(s+ab);
          break;
      }
    } while (choice!=7);
  }
}
