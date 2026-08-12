package module1;
import java.util.Scanner;
class CircleEval{
	double radius;
	CircleEval(double r){
		radius=r;
	}
	void area() {
		double area=3.14*radius*radius;
		System.out.println("Area : "+area);
		
	}
	void perimeter() {
		double perimeter= 2*3.14*radius;
		System.out.println("Perimeter: "+perimeter);
	}
}

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter radius: ");
		double rad=sc.nextDouble();
		sc.nextLine();
		CircleEval e=new CircleEval(rad);
		e.area();
		e.perimeter();
		sc.close();
		
		
		
	}

}
