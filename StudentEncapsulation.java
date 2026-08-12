package module1;
import java.util.Scanner;
class StudentData{
	private String name;
	private int age ;
	public String getName()
	{
		return name;
		
	}
	public void setName(String myname)
	{
		name=myname;
		
	}
	public int getAge() {
		return age;
		
	}
	public void  setAge(int myage) {
		if(myage>0) {
			age=myage;
			
		}
		
	}
}
public class StudentEncapsulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		StudentData s=new StudentData();
		System.out.print("Enter student name:");
		String name=sc.nextLine();
		s.setName(name);
		System.out.print("Enter student age:");
		int age =sc.nextInt();
		s.setAge(age);
		System.out.println("Stuent Data");
		System.out.println("Name:"+s.getName());
		System.out.println("Age:"+s.getAge());
		sc.close();
		
		

	}

}
