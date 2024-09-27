import java.io.*;
import java.util.*;
interface Demo
{
     String name;
     int rollno;
     int percentage;

   
}
class Demo2 implements Demo
{
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

  public void display()
  {

    System.out.println("Name is:"+name);
    System.out.println("Rollno is:"+rollno);
    System.out.println("Percenatage is:"+percentage);
  }
}

class Multilevel extends Demo2 implements Demo
{
  public static void main(String args[])
  {

     Multilevel s1=new Multilevel();

     s1.accept();
     s1.display();
  }
}