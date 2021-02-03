import java.util.*;
class assert1
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value above 50");
		int v=s.nextInt();
		assert v>=50:"Check your value again";
		System.out.println("value is "+v);
	}
}