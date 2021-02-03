import java.util.*;
public class Gen<T,U>
{
	T a;
	U b;
	void setval(T ab,U ac)
	{
		a=ab;
		b=ac;

	}
	T getval()
	{
		return a;


	}
	U getval2()
	{
		return b;
	}

	public static <T> T getMiddle(T [] a)
	{
		return a[a.length/2];
	}
	public static <T> void print(List<?super Integer> l)
	{
		System.out.print(l);
	}
	public static void main(String[] args) {
		Double d[]={10.0,8239.43,34.9,444.9,99.0};
		Gen<String,Integer> g=new Gen<String,Integer>();
		g.setval("Hello Sharon",20);
		System.out.println(g.getval());
		System.out.println(g.getval2());
		System.out.println(Gen.getMiddle(d));
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(40);
		l1.add(3);
		Gen.print(l1);
		System.out.println();
		List<String> l2=new ArrayList<String>();
		l2.add("hello");
		l2.add("SH");
		Gen.print(l2);
		System.out.println();

			}

}