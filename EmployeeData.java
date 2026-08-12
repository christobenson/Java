package module1;
import java.util.Scanner;

class Employee{
	int empId;
	double salary;
	String empName;
	Employee(int empId,String empName,double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Name: "+empName+"\nId: "+empId+"\nSalary: "+salary);
	}
}

public class EmployeeData {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter name of first  Employee: ");
		String name1=sc.nextLine();
		System.out.print("Enter Employee id: ");
		int id1=sc.nextInt();
		System.out.print("Enter Salary: ");
		double sal1=sc.nextDouble();
		System.out.println();
		
		System.out.print("Enter name of  Second  Employee: ");
		String name2=sc.nextLine();
		System.out.print("Enter Employee id: ");
		int id2=sc.nextInt();
		System.out.print("Enter Salary: ");
		double sal2=sc.nextDouble();
		Employee e1=new Employee(id1,name1,sal1);
		Employee e2=new Employee(id2,name2,sal2);
		e1.display();
		e2.display();
		System.out.print(e1.empId);
		
		
	}

}
