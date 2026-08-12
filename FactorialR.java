package module1;
import java.util.Scanner;
class Eval{
	int fact(int n)
	{
		if (n==1) {
			return 1;
		}
		else {
			return(n*fact(n-1));
		}
	}
}

public class FactorialR {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter  a number");
		int a=sc.nextInt();
		Eval e=new Eval();
		System.out.println("factorial:"+e.fact(a));
		
	}

}
