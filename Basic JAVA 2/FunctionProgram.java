import java.util.*;
public class FunctionProgram
{
    public static int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter First Number ");
        int x=s1.nextInt();
        System.out.println("Enter Second Number ");
        int y=s1.nextInt();
        int addition= add(x,y);
        System.out.println("Addition is "+addition);
    }
}