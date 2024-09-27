import java.io.*;
import java.util.*;
class Demo
{
     String name;
    int rollno;
    int percentage;

  public void accept()
  {
     
   Scanner s=new Scanner(System.in);

    System.out.println("Enter a Name:");
    name=s.next();

    System.out.println("Enter a RollNo:");
    rollno=s.nextInt();

    System.out.println("Enter a Percentage:");
    percentage=s.nextInt();
  }
}
class Demo2 extends Demo
{
  public void display()
  {
    System.out.println("Name is:"+name);
    System.out.println("Rollno is:"+rollno);
    System.out.println("Percenatage is:"+percentage);

  }
}

class Multilevel extends Demo2
{
  public static void main(String args[])
  {

     Multilevel s1=new Multilevel();

     s1.accept();
     s1.display();
  }
}