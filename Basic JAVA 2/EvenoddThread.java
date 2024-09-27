import java.io.*;
import java.util.*;
import java.lang.*;
class Evennum implements Runnable
{
    public void run()
    {
         for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }
     }
    
}
class Oddnum implements Runnable 
{
    public void run()
    {
        for(int i=10;i>0;i--)
        {
            System.out.println(i);
        }
    }
}
public class EvenoddThread 
{
   public static void main(String args[])
   {
     Evennum e1=new Evennum();
     Thread th1=new Thread(e1);
     th1.start();

     Oddnum o1=new Oddnum();
     Thread th2=new Thread(o1);
     th2.start();
   }
}