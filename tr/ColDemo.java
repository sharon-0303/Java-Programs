import java.util.*;
class ColDemo
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> m=new HashMap<String,Integer>();
		m.put("Aron",1);
		m.put("Bless",2);
		m.put("Char",3);
		m.put("Dump",4);
		m.put("Eagle",5);
		m.put("Fish",6);
		m.put("God",7);
		m.put("High",8);
		m.put("IT",9);
		m.put("Jolm",10);
		m.put("K",11);
		System.out.println("Value of the Key IT is "+m.get("IT"));
		Set set = m.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry)iterator.next();
         System.out.print("key is: "+ me.getKey() + " & Value is: ");
         System.out.println(me.getValue());
		}
	}
}