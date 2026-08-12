package module1;
import java.util.Scanner;
class Box3
{
	int w,d,h;
	Box3(int height,int depth,int width)
	{
		w=width;
		h=height;
		d=depth;
		
	}
	int volume()
	{
		return(w*d*h);
	}
}

public class Volume {

	public static void main(String[] args) {
		System.out.println("enter width, depth and height :");
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		int width=sc.nextInt();
		int depth=sc.nextInt();
		Box3 b=new Box3(height,depth,width);
		int vol=b.volume();
		System.out.println("w= "+b.w+" d= "+b.d+" h= "+b.h);
		System.out.println("Volume="+vol);
		sc.close();
		}

}
