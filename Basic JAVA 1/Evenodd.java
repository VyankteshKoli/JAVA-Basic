import java.io.*;
import java.util.*;
class A extends Thread
{ int j;
    public void run()
    {
        System.out.println("Odd Number is:");

        for(j=1;j<50;j++)
        {  if(j %2 !=0)
            {
            System.out.println(j);
            }
        }
    }
}
class B extends Thread
{  int i;
     public void run()
     {
        System.out.println("Even Number is:");

        for(i=1;i<50;i++)
        {   if(i%2 == 0)
            {
            System.out.println(i);
            }
        }   
     }
}
class Evenodd
{   public static void main(String args)
    {
        A a=new A();
        B b=new B();
        a.start();
        b.start();
    }
}
