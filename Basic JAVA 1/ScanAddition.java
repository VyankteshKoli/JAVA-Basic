import java.io.*;
import java.util.*;
public class ScanAddition
{
    public static void main(String args[])
    {
        int a,b,sum;

        // takinng a Input 
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a First NO:");
        a=s.nextInt();
        System.out.println("Enter a Second NO:");
        b=s.nextInt();
        
        sum=a+b;
        System.out.println("Sum is:"+sum);
    }
} 