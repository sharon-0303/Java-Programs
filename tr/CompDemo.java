import java.util.*;
 class Mycomp implements Comparator<String> {

	@Override
	public int compare(String a, String b) {		
		System.out.println(a+" "+b);
		return a.compareTo(b);
	}
	

}
public class CompDemo {
	public static void main(String[] args)
	{
		Mycomp m=new Mycomp();
		TreeSet<String> ts=new TreeSet<String>(m);
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			Object e=new i.next();
			System.out.print(e+" ");
			
		}
		System.out.println();
		
	}

}