package module1;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit=sc.nextInt();
		System.out.println("Even numbers till " +limit+" are:");
		for(int i=1; i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
			}
		}

		sc.close();
	}
	

}
