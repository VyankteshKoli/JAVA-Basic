import java.io.*;
import java.util.*;
class TestEncapsulation
{
    int age;
    int rollno;
    String name;

    
    public int getage() 
	{ return age; }
 
   
    public String getname() 
	{ return name; }
 
   
    public int getroll() 
	{ return rollno; }


    public void setname(String newname)
    {
      name = newname;
    }
    
    public void setage(int newage)
    {
      age = newage;
    }

    public void setrollno(int newrollno)
    {
      rollno = newrollno;
    }

}

class Encapsulation
{
  public static void main(String args[])
  {
    TestEncapsulation e=new  TestEncapsulation();

    e.setname("Vyanktesh");
    e.setage(19);
    e.setrollno(26);

      // Displaying values of the variables
      System.out.println("Name: " +e.getname());
      System.out.println("Age: " +e.getage());
      System.out.println("Roll: " +e.getroll());

  }
}
    
    