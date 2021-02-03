import java.io.*;
import java.util.*;
class student implements Serializable
{
	String name;
	int rollno;
	int m1,m2,m3;
	public void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		name = sc.nextLine();
		System.out.println("enter rollno:");
		rollno=sc.nextInt();
		System.out.println("enter mark1:");
		m1=sc.nextInt();
		System.out.println("enter mark2:");
		m2=sc.nextInt();
		System.out.println("enter mark3:");
		m3=sc.nextInt();
	}
	public void printData()
	{
		System.out.println("enter name:"+name);
		System.out.println("enter rollno:"+rollno);
		System.out.println("enter mark1:"+m1);
		System.out.println("enter mark2:"+m2);
		System.out.println("enter mark3:"+m3);
		System.out.println("total="+(m1+m2+m3));
		System.out.println("average="+(m1+m2+m3/3));
	}
	public int getrollno()
	{
		return rollno;
	}
	
}
class serialIO
{
	public static void main(Stringargs[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("student.dat");
			ObjectOutputStream oos=ObjectOutputStream(fos);
			Scanner scn=new Scanner(System.in);
			System.out.println("enter the no of students");
			int no=scn.nextInt();
			for(int i=0;i<no;i++)
			{
				student st=new student();
				st.readData();
				oos.writeObject(st);
			}
			oos.close();
			fos.close();
			
			FileInputStream fis=new FileInputStream("student.dat");
			ObjectInputStream oos=ObjectInputStream(fis);
			System.out.println("enter rollno to print mark sheet:");
			int roll=scn.nextInt();
			for(int i=0;i<no;i++)
			{
				student stn=(student) ois.readObject();
				if(stn.getrollno()==roll)
					stn.printData();
			}
			ois.close();
			fis.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}