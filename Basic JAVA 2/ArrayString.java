import java.io.*;
import java.util.*;
public class ArrayString
{
	public static void main(String[] args) 
	{
		int n,i;

		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the Number of Elements you want :");
			n=sc.nextInt();
			
			String[] array=new String[10];
			System.out.println("Enter the Elements:- ");
			for(i=0;i<n;i++)
			{
				array[i]=sc.next();
			}
			System.out.println("Elements in Array are:- ");
			for(i=0;i<n;i++)
			{
			System.out.println(array[i]);
			}
		}
	}
}
