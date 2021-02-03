import java.util.Scanner;
class reverse
{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		if (num>1) 
		{
			for (int i=2;i<num ;i++ ) {
				if (num%i==0) 
				{
					count++;
					
				}
				}
				if (count>1)
				{
					System.out.println("The number is not prime");	
				}
				else
				{
					System.out.println("The number is prime");
				}
					
		}
		else
		{
			System.out.println("enter number above 1");
		}
		
	}
}