import java.io.*;
import java.util.*;
class Demo
{
     String name;
    int rollno;

  public void accept()
  {
     
   Scanner s=new Scanner(System.in);

    System.out.println("Enter a Name:");
    name=s.next();

    System.out.println("Enter a RollNo:");
    rollno=s.nextInt();
  }
}
class SingleInheritance extends Demo
{
  public void display()
  {
    System.out.println("Name is:"+name);
    System.out.println("Name is:"+rollno);
  }

  public static void main(String args[])
  {

     SingleInheritance s1=new SingleInheritance();

     s1.accept();
     s1.display();
  }
}