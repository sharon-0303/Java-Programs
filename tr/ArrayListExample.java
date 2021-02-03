import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args) 
	{

		ArrayList<String> a=new ArrayList<String>();
		a.add("sharon");
		a.add("abc");
		a.add("vdfdf");
		a.add("ffsfssf");
		a.add("fdfdfd");
		a.add("sn");
		a.add("sh");
		a.add("n");
		a.add(2,"f");
		System.out.println("Elements");
		//System.out.println(a);
		Iterator i=a.iterator();
		if(i.hasNext()==true)
		{
			System.out.println(a+"");
		}
		//System.out.println("Size of the list"+a.size());
		//System.out.println();
		//System.out.println("After removing");
		//a.remove("sn");
		// a.remove(3);
		// //System.out.println("*******************************************");
		// System.out.println("Elements after deletion");
		// //System.out.println(a);
		// System.out.println("Size of the list"+a.size());
		// System.out.println();
		// System.out.println("********************************************");
		ListIterator l=a.listIterator();
		System.out.println("**************************");
		while(l.hasNext())
		{
			Object o=l.next();
			l.set(o+"+");
			
			System.out.print(o+" ");
		}
		System.out.println("*******************************");
		while(l.hasPrevious())
		{
			Object o=l.previous();

			System.out.print(o+" ");
		}


	}
}