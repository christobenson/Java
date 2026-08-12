package module1;
class Student1{
	String name;
	int rno;
	String department;
	Student1(String name,int rno,String department){
		this.name=name;
		this.rno=rno;
		this.department=department;	
	}
	void display() {
		System.out.println("Student name:"+name);
		System.out.println("Roll No:"+rno);
		System.out.println("Department:"+department);
		
	}

}

public class Student {

	public static void main(String[] args) {
		Student1 s1= new Student1("Christo",20,"CSE");
				s1.display();

	}

}
