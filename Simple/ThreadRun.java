class RunTh implements Runnable
{
public void run()
{
for (int i = 0;i<10;i++)
{
System.out.println("Value of Runth "+i );
}
}
}

class RunTh1 implements Runnable
{
public void run()
{
for (int i = 0;i<10;i++)
System.out.println("Value of Runth1  "+i );
}
}

class RunTh2 implements Runnable
{
public void run()
{
for (int i = 0;i<10;i++)
System.out.println("Value of Runth2  "+i );
}
}


class ThreadRun
{
public static void main(String []at)
{
RunTh th1 = new RunTh();
RunTh1 th2 = new RunTh1();
RunTh2 th3 = new RunTh2();
Thread thh1 = new Thread(th1);
Thread thh2 = new Thread(th2);
Thread thh3 = new Thread(th3);
thh1.start();
thh2.start();
thh3.start();

System.out.println(thh1.toString()+ "  "+thh2.toString()+"   "+thh3.toString());
System.out.println("Thread group of thh1 : "+thh1.getThreadGroup());
System.out.println("Thread group of thh1 : "+thh2.getThreadGroup());
System.out.println("Thread group of thh1 : "+thh3.getThreadGroup());

System.out.println("Name of thh1 : "+thh1.getName());
System.out.println("ID of thh1 : "+thh1.getId());

}
}