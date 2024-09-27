import java.util.*;

		class Student{
			String name;
			int age;
			
			public void printInfo(String name){
				System.out.println(name);
			}
			
			public void printInfo(int age){
				System.out.println(age);
			}
			
			
			
		}
		public class Polymorphism{
	public static void main (String [] args){
		Student s1 = new Student();
		s1.name="aman";
		s1.age=24;
		
		s1.printInfo(s1.name);
		s1.printInfo(s1.age);
		
		
	}
}