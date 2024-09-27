import java.io.*;
import java.util.*;
public class Array
{
	public static void main(String[] args) 
	{
		int n,i;
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the Number of Elements:");
			n=sc.nextInt();
			
			int[] array=new int[10];
			System.out.println("Enter the elements ");
			for(i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}
			System.out.println("Elements in array are:- ");
			for(i=0;i<n;i++)
			{
			System.out.println(array[i]);
			}
		}
	}
}