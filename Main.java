import java.util.Scanner;
public class Main
{
	public static void main(String args [])
	{
		System.out.println("			Welcome to Railways Seat Allocation		");
		System.out.println("	Please Follow the instructions as follows		");
		Scanner in = new Scanner(System.in);
		int b;
		System.out.println("enter the number of seats you want to check");
		b=in.nextInt();
		int a[]=new int[b];
		for(int i=0;i<b;i++)
		{
			System.out.println("enter your seat numbers");
			a[i]=in.nextInt();
			int c;
			c=a[i];
			int d=c%8;
			if(d==1)
				System.out.println("left lower");
			else if(d==2)
				System.out.println("left middle");
			else if(d==3)
				System.out.println("left upper");
			else if(d==4)
				System.out.println("right lower");
			else if(d==5)
				System.out.println("right middle");
			else if(d==6)
				System.out.println("right upper");
			else if(d==7)
				System.out.println("side lower");
			else 
				System.out.println("side upper");
		}
	}
	
}
			