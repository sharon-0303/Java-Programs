import java.util.*;
class Mycomp1 implements Comparator {
Map map;
public Mycomp1(Map m)
{
	map=m;
}

public int compare(Object o1,Object o2)
{
	return((Integer)map.get(o1)).compareTo((Integer)map.get(o2));
	
} 

} 
class Map1 
{
	public static void main(String[] args) {
		
	
		HashMap<String,Integer> m=new HashMap<String,Integer>();
		Mycomp1 mc=new Mycomp1(m); 
		TreeMap <String,Integer> tm=new TreeMap<String,Integer>(mc);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements");
		String ele="";
		for(int i=0;i<5;i++)
		{
			ele=s.nextLine();
			if(m.containsKey(ele))
			{
			int ab=m.get(ele);
			m.replace(ele,ab+1);

			}
			else
			{
				m.put(ele,1);
			}
		}
		tm.putAll(m);
		
		Set set = tm.entrySet();
		Iterator iterator = set.iterator();		
		
		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry)iterator.next();
         System.out.print("Value: "+ me.getKey() + " & Key is: ");
         System.out.println(me.getValue());
		}


	}
}