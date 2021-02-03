class Callme
{
synchronized void call(String s)
{
try
{
System.out.print("[");
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println(s+"]");
}
}

class target implements Runnable
{
Callme tgt;
String str;
Thread t;
target(Callme tg, String s)
{
tgt = tg;
str = s;
t = new Thread(this);
}
public void run()
{
tgt.call(str);
}

}

class MySync
{
public static void main(String at[])
{
Callme c1 = new Callme ();
target ob1 = new target(c1, "Hello");
target ob2 = new target(c1, "Welcome");
target ob3 = new target(c1, "Synchronization");
ob1.t.start();
ob2.t.start();
ob3.t.start();

}
}