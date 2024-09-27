import java.lang.*;
class Evennum extends Thread
{
    public void run()
    {
        try {
             {
                for(int i=2;i<=50;i=i+2)
                {
                    System.out.println(i);
                    sleep(200);
                }
            }
        }catch(InterruptedException e)
         {
            System.out.println(e);
         }
    }
}
class Oddnum extends Thread
{
    public void run()
    {
            for(int i=1;i<50;i=i+2)
            {
                System.out.println(i);
            }
    }
}
public class EvenOdd
{       public static void main(String args[])
     {
        new Evennum().start();
        new Oddnum().start();
  }
}