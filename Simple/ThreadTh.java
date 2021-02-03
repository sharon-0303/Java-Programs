class RunTh extends Thread
{
public void run()
{
for (int i = 0;i<10;i++)
{
System.out.println("Runth "+i );
}
}
}

class RunTh1 extends Thread
{
public void run()
{
for (int i = 0;i<10;i++)
System.out.println("Runth1  "+i );
}
}

class RunTh2 extends Thread
{
public void run()
{
for (int i = 0;i<10;i++)
System.out.println("Runth2  "+i );
}
}


class ThreadTh
{
public static void main(String []at)
{
RunTh th1 = new RunTh();
RunTh1 th2 = new RunTh1();
RunTh2 th3 = new RunTh2();

th1.start();
th2.start();
th3.start();

System.out.println(th1.toString()+ "  "+th2.toString()+"   "+th3.toString());

System.out.println("Thread group of th1 : "+th1.getThreadGroup());
System.out.println("Thread group of th2 : "+th2.getThreadGroup());
System.out.println("Thread group of th3 : "+th3.getThreadGroup());

System.out.println("Thread Priority of th1 : "+th1.getPriority());
System.out.println("Thread Priority of th2 : "+th2.getPriority());
System.out.println("Thread Priority of th3 : "+th3.getPriority());

System.out.println("Name of th1 : "+th1.getName());
System.out.println("ID of th1 : "+th1.getId());

System.out.println("Name of th2 : "+th2.getName());
System.out.println("ID of th2 : "+th2.getId());

System.out.println("Name of th3 : "+th3.getName());
System.out.println("ID of th3 : "+th3.getId());

}
}