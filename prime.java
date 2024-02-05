import java.util.Scanner;
public class prime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num:");
		int n=s.nextInt();
		int f=1; //prime
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				f=0; //composite
				break;
			}
		}
		if(n==1 || n==0)
		{
			System.out.println("neither prime nor composite");
			
		}
		
		else if(f==1)
		{
			System.out.println("prime");
		
		}
		else
		{
			System.out.println("composite");
		}
	}
}
		

